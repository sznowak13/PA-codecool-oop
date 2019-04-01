package com.codecool.mediatheque.Model;

import java.time.LocalDate;

public abstract class MediaItem {

    private final int id;
    private String title;
    private java.time.LocalDate releaseDate;
    private String author;
    private ItemStatus availibilitystatus;

    public MediaItem(int id, String title, LocalDate releaseDate, String author) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.author = author;
        this.availibilitystatus = ItemStatus.AVAILABLE;
    }

    public int Id() {
        return id;
    }

    public abstract String preview();

    public String getTitle() {
        return title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public String getAuthor() {
        return author;
    }

    public ItemStatus getAvailibilitystatus() {
        return availibilitystatus;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailibilitystatus(ItemStatus availibilitystatus) {
        this.availibilitystatus = availibilitystatus;
    }
}
