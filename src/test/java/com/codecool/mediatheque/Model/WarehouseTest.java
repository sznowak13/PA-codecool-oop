package com.codecool.mediatheque.Model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {

    private Warehouse warehouse;

    @BeforeEach
    void setup() {
        warehouse = new Warehouse();
    }

    @AfterEach
    void tearDown() {
        warehouse = null;
    }

    @Test
    void addItem() {
        AudioBook book = new ItemBuilder(0).setTitle("test")
                .setAuthor("test")
                .setReleaseDate(LocalDate.of(2000, 12, 12)).buildAudioBook(89);
        warehouse.addItem(book);
        assertEquals(book, warehouse.getItemById(0));
        MusicAlbum album = new ItemBuilder(1).setTitle("test2")
                .setAuthor("test2").setReleaseDate(LocalDate.of(2001, 12, 12))
                .buildMusicAlbum(78);
        warehouse.addItem(album);
        assertEquals(album, warehouse.getItemById(1));

        Movie movie = new ItemBuilder(2).setTitle("test2")
                .setAuthor("test3").setReleaseDate(LocalDate.of(2002, 12 ,12))
                .buildMovie(120);
        warehouse.addItem(movie);
        assertEquals(movie, warehouse.getItemById(2));
    }

    @Test
    void removeItem() {
        MediaItem item = new ItemBuilder(0).setTitle("test")
                .setReleaseDate(LocalDate.of(2000, 12, 12)).setAuthor("test2").buildMovie(10);
        warehouse.addItem(item);
        assertEquals(1, warehouse.size());
        warehouse.removeItem(0);
        assertEquals(0, warehouse.size());
    }

    @Test
    void editItem() {
        MediaItem item = new ItemBuilder(0).setTitle("test")
                .setReleaseDate(LocalDate.of(2000, 12, 12)).setAuthor("qwerty")
                .buildMovie(12);
        warehouse.addItem(item);
        warehouse.editItem(0, "TITLE", "newTitle");
        assertEquals("newTitle", item.getTitle());
        warehouse.editItem(0, "AUTHOR", "Just Kiddin Rowling");
        assertEquals("Just Kiddin Rowling", item.getAuthor());
        warehouse.editItem(0, "DATE", LocalDate.of(1998, 9, 9));
        assertEquals(LocalDate.of(1998, 9, 9), item.getReleaseDate());
    }

}