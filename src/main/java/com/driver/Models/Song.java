package com.driver.Models;

public class Song {
    private String title;
    private int length;
    private int likes;
    private  String artistName;

    public Song(){

    }

    public Song(String title, int length){
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getArtistName() {
        return artistName;
    }
}
