package com.codecool.mediatheque.Model;

import java.time.LocalDate;

public class ItemBuilder {

    private String title = "";
    private LocalDate releaseDate;
    private String author = "";
    private int id;

    public ItemBuilder(int id) {
        this.id = id;
    }

    public ItemBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public ItemBuilder setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public ItemBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public AudioBook buildAudioBook(int pages) {
        return new AudioBook(this, pages);
    }

    public MusicAlbum buildMusicAlbum(int lengthInMin) {
        return new MusicAlbum(this, lengthInMin);
    }

    public Movie buildMovie(int length) {
        return new Movie(this, length);
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }
}
