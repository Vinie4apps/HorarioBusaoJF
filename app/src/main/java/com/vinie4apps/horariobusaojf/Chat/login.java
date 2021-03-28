package com.vinie4apps.horariobusaojf.Chat;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FacebookAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.vinie4apps.horariobusaojf.Chat.models.User;
import com.vinie4apps.horariobusaojf.Main.MainActivity;
import com.vinie4apps.horariobusaojf.R;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;


public class login extends AppCompatActivity {

    private static final int RC_SIGN_IN = 1;
    EditText txtemail, txtpass, emailforget;
    TextView forget, mTextViewS;
    Button enviforget;
    private SignInButton loginGoogle;

    private GoogleSignInClient mGoogleSingClient;
    private CallbackManager callbackManager;
    private LoginButton loginface;
    private static final String TAG = "FacebookAuthentication";
    private AccessTokenTracker accessTokenTracker;


    FirebaseAuth auth;
    FirebaseAuth.AuthStateListener authStateListener;
    DatabaseReference reference;
    private BottomSheetBehavior bottomSheetBehavior;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        FacebookSdk.sdkInitialize(getApplicationContext());
        loginface = findViewById(R.id.login_button);
        loginface.setReadPermissions("email");
        callbackManager = CallbackManager.Factory.create();
        loginface.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                Log.d(TAG,"Sucesso" + loginResult);
                handlefacebookToken(loginResult.getAccessToken());
            }

            @Override
            public void onCancel() {

            }

            @Override
            public void onError(FacebookException error) {

            }
        });

    authStateListener = new FirebaseAuth.AuthStateListener() {
        @Override
        public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
            FirebaseUser userFace = firebaseAuth.getCurrentUser();
            if (userFace!= null){
                updateUifacebook(userFace);
            } else{
                updateUifacebook(null);
            }
        }
    };

    accessTokenTracker = new AccessTokenTracker() {
        @Override
        protected void onCurrentAccessTokenChanged(AccessToken oldAccessToken, AccessToken currentAccessToken) {
            if (currentAccessToken == null){
                    auth.signOut();
            }
        }
    };




        // Login com Google

        loginGoogle = findViewById(R.id.googlelogin);

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        mGoogleSingClient = GoogleSignIn.getClient(this, gso);

        loginGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                singInGoogle();
            }
        });


        //login E-mail e senha Padrão

        txtemail = (EditText) findViewById(R.id.edit_email_login);
        txtpass = (EditText) findViewById(R.id.edit_password_login);
        forget = (TextView) findViewById(R.id.txt_esqueceu);
        enviforget = (Button) findViewById(R.id.bntenviar);
        emailforget = (EditText) findViewById(R.id.editTextTextEmailAddress);

        auth = FirebaseAuth.getInstance();

        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View sheet = findViewById(R.id.sheet_log);
                bottomSheetBehavior = BottomSheetBehavior.from(sheet);
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                mTextViewS = findViewById(R.id.textstage);


                enviforget.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        auth.sendPasswordResetEmail(String.valueOf(emailforget))
                                .addOnCompleteListener(new OnCompleteListener<Void>() {
                                    @Override
                                    public void onComplete(@NonNull Task<Void> task) {
                                        if (task.isComplete()) {

                                            bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                                            Toast.makeText(login.this, "Email de Recuperação de senha enviado. Verifique sua caixa de email !", Toast.LENGTH_LONG).show();
                                        }
                                    }
                                });
                    }
                });

            }
        });

        reference = FirebaseDatabase.getInstance().getReference().child("Users");

    }



    public void loginUsers(View view) {

        String email = txtemail.getText().toString();
        String pass = txtpass.getText().toString();

        if (email == null || email.isEmpty() || pass == null || pass.isEmpty()) {
            Toast.makeText(login.this, "Email e senha devem ser preenchidos", Toast.LENGTH_SHORT).show();
            return;
        }
        auth.signInWithEmailAndPassword(email, pass)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {

                            Intent intent = new Intent(login.this, MainActivity.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(intent);
                        } else {
                            Toast.makeText(login.this, "Email ou senha estão incorretos !", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    public void gotoReg(View view) {
        Intent i = new Intent(login.this, register.class);
        startActivity(i);
    }


    private void singInGoogle() {

        Intent singIngoogle = mGoogleSingClient.getSignInIntent();
        startActivityForResult(singIngoogle, RC_SIGN_IN);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        callbackManager.onActivityResult(requestCode,resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RC_SIGN_IN) {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            handleSinginResult(task);
        }


    }

    private void handleSinginResult(Task<GoogleSignInAccount> completetask) {

        try {
            GoogleSignInAccount acc = completetask.getResult(ApiException.class);
            Toast.makeText(login.this, "Login realizado com sucesso", Toast.LENGTH_SHORT).show();
            FirebaseGoogleAuth(acc);

        } catch (ApiException e) {
            e.printStackTrace();
            Toast.makeText(login.this, "Erro ao fazer o login", Toast.LENGTH_SHORT).show();
            FirebaseGoogleAuth(null);

        }
    }

    private void FirebaseGoogleAuth(GoogleSignInAccount acct) {
        AuthCredential authCredential = GoogleAuthProvider.getCredential(acct.getIdToken(), null);
        auth.signInWithCredential(authCredential).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(login.this, "Login realizado com sucesso", Toast.LENGTH_SHORT).show();
                    FirebaseUser user = auth.getCurrentUser();
                    updateUi(user);
                    Intent intent = new Intent(login.this, MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                } else {
                    Toast.makeText(login.this, "Erro ao fazer o login", Toast.LENGTH_SHORT).show();
                    updateUi(null);

                }
            }
        });
    }

    private void updateUi(FirebaseUser fUser) {

        FirebaseUser firebaseUser = auth.getCurrentUser();
        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(getApplicationContext());
        if (account != null) {
            String name = account.getDisplayName();
            String email = account.getEmail();
            User ug = new User();
            ug.setEmail(email);
            ug.setName(name);
            reference.child(firebaseUser.getUid()).setValue(ug)
                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()) {
                            } else {
                                Toast.makeText(login.this, "Erro, não foi possivel criar sua conta. Tente novamente mais tarde !", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

        }
    }
    private void handlefacebookToken (AccessToken token){
        Log.d(TAG, "handleFacebookToken" + token);

        AuthCredential credential = FacebookAuthProvider.getCredential(token.getToken());
        auth.signInWithCredential(credential).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Log.d(TAG, "sing ok ");
                    FirebaseUser user = auth.getCurrentUser();
                    updateUifacebook(user);
                    Toast.makeText(login.this, "Login realizado com sucesso", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this, MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }else {
                    Log.d(TAG, "error");
                    Toast.makeText(login.this, "Erro, não foi possivel criar sua conta. Tente novamente mais tarde !", Toast.LENGTH_SHORT).show();
                    updateUifacebook(null);

                }
            }
        });

    }
    private void updateUifacebook (FirebaseUser user){
        FirebaseUser firebaseUser = auth.getCurrentUser();
        if (user != null){
            String name = user.getDisplayName();
            String email = user.getEmail();
            User uf = new User();
            uf.setEmail(email);
            uf.setName(name);
            reference.child(user.getUid()).setValue(uf)
                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()) {
                            } else {
                                Toast.makeText(login.this, "Erro, não foi possivel criar sua conta. Tente novamente mais tarde !", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }

        }

    @Override
    protected void onStart() {
        super.onStart();
        auth.addAuthStateListener(authStateListener);
    }

    @Override
    protected void onStop() {
        super.onStop();

        if (authStateListener != null){
            auth.removeAuthStateListener(authStateListener);
        }
    }
}