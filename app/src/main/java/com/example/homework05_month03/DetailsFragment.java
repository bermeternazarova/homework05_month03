package com.example.homework05_month03;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsFragment extends Fragment {

    TextView message, title;
    ImageView image;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        message = view.findViewById(R.id.message_tv);
        title = view.findViewById(R.id.title_tv);
        image = view.findViewById(R.id.image_iv);

        Bundle bundle = getArguments();
        message.setText(bundle.getString("message"));
        title.setText(bundle.getString("title"));
        image.setImageResource(bundle.getInt("image"));
    }

}