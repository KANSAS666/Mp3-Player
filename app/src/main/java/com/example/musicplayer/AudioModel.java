package com.example.musicplayer;

import java.io.Serializable;
//Массив песен
public class AudioModel implements Serializable  {
    String path; //путь
    String title; //название
    String duration; //продолжительность песни

    //конструктор
    public AudioModel(String path, String title, String duration) {
        this.path = path;
        this.title = title;
        this.duration = duration;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    //продолжительность
    public void setDuration(String duration) {
        this.duration = duration;
    }
}
