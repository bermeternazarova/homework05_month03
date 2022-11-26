package com.example.homework05_month03;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterChat extends RecyclerView.Adapter<ChatViewHolder> {

   private ArrayList<ChatModel> chats;
   private ItemClickListener click;

    public AdapterChat(ArrayList<ChatModel> chats, ItemClickListener click) {
        this.chats = chats;
        this.click = click;
    }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ChatViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, @SuppressLint("RecyclerView") int position) {
     holder.bind(chats.get(position));
     holder.itemView.setOnClickListener(view ->
             click.itemClickListener(chats.get(position))
     );

    holder.chat_item_container.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            click.itemClickListener(chats.get(position));
        }
    });}

    @Override
    public int getItemCount() {
        return chats.size();
    }
}
