package com.example.homework05_month03;

public class ChatModel {
    int image;
    String message;
    String title;

    public ChatModel(int image, String title,String message) {
        this.image = image;
        this.message = message;
        this.title = title;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public String getMessage() {
        return message;
    }

    public String getTitle() {
        return title;
    }
}
