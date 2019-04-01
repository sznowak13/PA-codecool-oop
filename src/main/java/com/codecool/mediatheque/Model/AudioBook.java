package com.codecool.mediatheque.Model;

import java.time.LocalDate;

public class AudioBook extends MediaItem {

    private int pages;

    public AudioBook(ItemBuilder builder, int pages) {
        super(builder.getId(), builder.getTitle(), builder.getReleaseDate(), builder.getAuthor());
        this.pages = pages;
    }

    @Override
    public String preview() {
        return null;
    }
}
