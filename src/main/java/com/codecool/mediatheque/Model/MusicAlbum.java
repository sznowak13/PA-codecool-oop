package com.codecool.mediatheque.Model;

import java.time.LocalDate;

public class MusicAlbum extends MediaItem {

    private int lengthInMins;

    public MusicAlbum(ItemBuilder builder, int lengthInMins) {
        super(builder.getId(), builder.getTitle(), builder.getReleaseDate(), builder.getAuthor());
        this.lengthInMins = lengthInMins;
    }

    @Override
    public String preview() {
        return null;
    }
}
