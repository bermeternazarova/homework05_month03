package com.example.homework05_month03;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class ListFragment extends Fragment implements ItemClickListener{

    RecyclerView recyclerView;
    private ArrayList<ChatModel>chats;
    ExtendedFloatingActionButton button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button=view.findViewById(R.id.button);
        recyclerView=view.findViewById(R.id.chats_rv);
        chats=new ArrayList<>();
        AdapterChat adapter = new AdapterChat(chats,this::itemClickListener);
        recyclerView.setAdapter(adapter);
        setChats();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chats.add(0,new ChatModel(R.drawable.coffee,"Новая ячейка ","coffee"));
                adapter.notifyDataSetChanged();
            }
        });
    }

    public void itemClickListener(ChatModel chatModel) {
        Bundle bundle = new Bundle();
        DetailsFragment fragment = new DetailsFragment();
        bundle.putString("message",chatModel.message);
        bundle.putString("title",chatModel.title);
        bundle.putInt("image",chatModel.image);
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_ct,fragment).addToBackStack("").commit();

    }
    private void setChats(){
        chats.add(new ChatModel(R.drawable.teory02,"Теория","Начальный уровень"));
        chats.add(new ChatModel(R.drawable.pazl,"Учим слова","Выучено 23/500"));
        chats.add(new ChatModel(R.drawable.allfabet,"Пишем слова","Уровень новика 03"));
        chats.add(new ChatModel(R.drawable.pazl2,"Составляем слова","Уровень новичка "));
        chats.add(new ChatModel(R.drawable.audio,"Аудирование","Уровень новичка 02"));
        chats.add(new ChatModel(R.drawable.pero,"Диктант","Уровень новичка"));
        chats.add(new ChatModel(R.drawable.dictofone,"Произношение","Уровень новичка"));
        chats.add(new ChatModel(R.drawable.testy,"Тесты","Проверь себя"));
        chats.add(new ChatModel(R.drawable.djoystik,"Игры","Увлекательно"));
        chats.add(new ChatModel(R.drawable.key,"Полная версия","Требуется авторизация"));
    }
}