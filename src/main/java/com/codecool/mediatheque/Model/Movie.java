package com.codecool.mediatheque.Model;

import java.time.LocalDate;

public class Movie extends MediaItem {

    private int lengthInMin;

    public Movie(ItemBuilder builder, int lengthInMin) {
        super(builder.getId(), builder.getTitle(), builder.getReleaseDate(), builder.getAuthor());
        this.lengthInMin = lengthInMin;
    }

    @Override
    public String preview() {
        return null;
    }
}
