package com.vinie4apps.horariobusaojf.ChatLinhas.Linha100;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.Time;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.vinie4apps.horariobusaojf.Chat.adapters.MessageAdapter;
import com.vinie4apps.horariobusaojf.Chat.login;
import com.vinie4apps.horariobusaojf.Chat.models.AllMethods;
import com.vinie4apps.horariobusaojf.Chat.models.Message;
import com.vinie4apps.horariobusaojf.Chat.models.User;
import com.vinie4apps.horariobusaojf.Main.MainActivity;
import com.vinie4apps.horariobusaojf.R;

import java.util.ArrayList;
import java.util.List;

public class Chat_linha133 extends AppCompatActivity implements View.OnClickListener {

        FirebaseAuth auth;
        FirebaseDatabase database;
        DatabaseReference messagedb;
        MessageAdapter messageAdapter;
        User u;
        List<Message> messages;

        RecyclerView recyclerView;
        EditText editText;
        Button button;
        String hr;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        auth = FirebaseAuth.getInstance();
        verifyAuthentication();
        messages = new ArrayList<>();

        setContentView(R.layout.activity_chat_teste);

        Thread t = new Thread() {

@Override
public void run() {
        try {
        while (!isInterrupted()) {
        Thread.sleep(1000);
        runOnUiThread(new Runnable() {
@Override
public void run() {
        Time today = new Time(Time.getCurrentTimezone());
        today.setToNow();
        hr = (today.format("%k:%M"));
        }
        });
        }
        } catch (InterruptedException e) {
        }
        }
        };

        t.start();

final Toolbar toolbar = findViewById(R.id.toochat);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("133 - Band./Ipiran./Arco. Chat");
        toolbar.setBackgroundColor(Color.parseColor("#031983"));
        toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
        toolbar.setSubtitleTextColor(Color.parseColor("#FFFFFF"));

        init();

final FirebaseUser currentuser = auth.getCurrentUser();
        u.setEmail(currentuser.getEmail());
        u.setUid(currentuser.getUid());

        database.getReference("Users").child(auth.getCurrentUser().getUid()).addListenerForSingleValueEvent(new ValueEventListener() {
@Override
public void onDataChange(@NonNull DataSnapshot snapshot) {
        u = snapshot.getValue(User.class);
        u.setUid(auth.getCurrentUser().getUid());
        AllMethods.name = u.getName();

        }

@Override
public void onCancelled(@NonNull DatabaseError error) {

        }
        });

        messagedb = database.getReference("Geral/linha133");
        messagedb.addChildEventListener(new ChildEventListener() {
@Override
public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
        Message message = snapshot.getValue(Message.class);
        message.setKey(snapshot.getKey());
        messages.add(message);
        displayMessages(messages);

        }

@Override
public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
        Message message = snapshot.getValue(Message.class);
        message.setKey(snapshot.getKey());

        List<Message> newMessages = new ArrayList<Message>();

        for (Message m : messages) {
        if (m.getKey().equals(message.getKey())) {
        newMessages.add(message);
        } else {
        newMessages.add(m);
        }
        }
        messages = newMessages;
        displayMessages(messages);
        }

@Override
public void onChildRemoved(@NonNull DataSnapshot snapshot) {
        Message message = snapshot.getValue(Message.class);
        message.setKey(snapshot.getKey());
        List<Message> newMessages = new ArrayList<Message>();

        for (Message m : messages) {
        if (!m.getKey().equals(message.getKey())) {
        newMessages.add(m);
        }
        }
        messages = newMessages;
        displayMessages(messages);
        }

@Override
public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

        }

@Override
public void onCancelled(@NonNull DatabaseError error) {

        }
        });
        }


private void init() {
        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();
        u = new User();

        recyclerView = (RecyclerView) findViewById(R.id.rvchat);
        editText = (EditText) findViewById(R.id.editTextTextPersonName);
        button = (Button) findViewById(R.id.bnteviar);

        button.setOnClickListener(this);
        messages = new ArrayList<>();


        }

private void verifyAuthentication() {
        auth = FirebaseAuth.getInstance();
        if (FirebaseAuth.getInstance().getUid() == null) {
        Intent intent = new Intent(Chat_linha133.this, login.class);
        startActivity(intent);
        finish();
        }
        }

@Override
public void onClick(View v) {
        if (!TextUtils.isEmpty(editText.getText().toString())) {
        Message message = new Message(editText.getText().toString(), u.getName(),hr);
        editText.setText("");
        messagedb.push().setValue(message);
        } else {
        Toast.makeText(getApplicationContext(), "Escreva uma Mensagem para enviar !", Toast.LENGTH_SHORT).show();
        }
        }

@Override
public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_chat, menu);
        return true;
        }

@Override
public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menulogout) {
        new AlertDialog.Builder(Chat_linha133.this)
        .setTitle("Fazer logout ?")
        .setMessage("Você não poderá utilizar o chat se não estiver logado !")
        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
public void onClick(DialogInterface dialog, int which) {
        auth.signOut();
        startActivity(new Intent(Chat_linha133.this, MainActivity.class));
        finish();
        }
        })

        .setNegativeButton(android.R.string.no, null)
        .setIcon(android.R.drawable.ic_dialog_alert)
        .show();


        }
        return super.onOptionsItemSelected(item);
        }

private void displayMessages(List<Message> messages) {

final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(Chat_linha133.this);
        recyclerView.setLayoutManager(linearLayoutManager);
        linearLayoutManager.setStackFromEnd(true);
        messageAdapter = new MessageAdapter(Chat_linha133.this,messages,messagedb);
        recyclerView.setAdapter(messageAdapter);

        }
        }