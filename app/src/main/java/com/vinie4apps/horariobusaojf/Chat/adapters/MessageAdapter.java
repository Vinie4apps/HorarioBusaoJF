package com.vinie4apps.horariobusaojf.Chat.adapters;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DatabaseReference;
import com.vinie4apps.horariobusaojf.Chat.models.AllMethods;
import com.vinie4apps.horariobusaojf.Chat.models.Message;
import com.vinie4apps.horariobusaojf.R;

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageAdapterViewHolder> {


    Context context;
    List<Message> messages;
    DatabaseReference messageDb;




    public MessageAdapter (Context context, List<Message> messages, DatabaseReference messageDb){
        this.context = context;
            this.messageDb = messageDb;
                this.messages = messages;
    }

    @NonNull
    @Override
    public MessageAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_message,parent,false);
        return new MessageAdapterViewHolder(view);

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    public void onBindViewHolder(@NonNull MessageAdapterViewHolder holder, int position) {
            Message message = messages.get(position);

            if (message.getName().equals(AllMethods.name)){

                holder.txnome.setText("Você : ");
                holder.txnome.setGravity(Gravity.START);
                holder.txnome.setTextColor(Color.parseColor("#031983"));

                holder.textView.setText(message.getMessage());
                holder.textView.setGravity(Gravity.START);

                holder.txhora.setText(message.getTime());




            } else {

                holder.linearLayout.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);

                holder.txnome.setText(message.getName() + " :");


                holder.txnome.setTextColor(Color.parseColor("#D00B08"));

                holder.textView.setText(message.getMessage());


                holder.btdelete.setVisibility(View.GONE);

                holder.txhora.setText(message.getTime());



            }
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }

    public class MessageAdapterViewHolder extends RecyclerView.ViewHolder {


        TextView textView, txhora, txnome;
        ImageButton btdelete;
        LinearLayout linearLayout;


        public MessageAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.TvTitle);
            btdelete = (ImageButton) itemView.findViewById(R.id.deleteb);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.lll);
            txhora = (TextView) itemView.findViewById(R.id.TvTime);
            txnome = (TextView) itemView.findViewById(R.id.TvNome);

            btdelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    messageDb.child(messages.get(getAdapterPosition()).getKey()).removeValue();
                }
            });
        }
    }


}
