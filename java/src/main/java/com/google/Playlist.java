package com.google;

import java.util.ArrayList;

public class Playlist {

    private final String name;
    private ArrayList<Video> videos;

    public Playlist(String name) {
        this.name = name;
        videos = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Video> getVideos() {
        return videos;
    }

    public void addVideo(Video video) {
        videos.add(video);
    }
}
