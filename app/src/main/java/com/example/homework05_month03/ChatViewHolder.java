package com.example.homework05_month03;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class ChatViewHolder extends RecyclerView.ViewHolder {

    ImageView imageIv;
    TextView mesageTv,titleTv;
    CardView chat_item_container;

    public ChatViewHolder(@NonNull View itemView) {
        super(itemView);
   imageIv=itemView.findViewById(R.id.image_iv);
   mesageTv=itemView.findViewById(R.id.message_tv);
   titleTv=itemView.findViewById(R.id.title_tv);

   chat_item_container=itemView.findViewById(R.id.chat_item);

    }

    public void bind(ChatModel chatModel) {
        imageIv.setImageResource(chatModel.getImage());
        mesageTv.setText(chatModel.getMessage());
        titleTv.setText(chatModel.getTitle());
    }
}
