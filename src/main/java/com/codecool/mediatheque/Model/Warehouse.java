package com.codecool.mediatheque.Model;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Warehouse {

    private List<MediaItem> items = new LinkedList<>();

    public void addItem(MediaItem item) {
        items.add(item);
    }

    public MediaItem getItemById(int id) {
        for (MediaItem item : items) {
            if (item.Id() == id) {
                return item;
            }
        }

        return null;
    }

    public void removeItem(int id) {
        for (MediaItem item : items) {
            if (item.Id() == id) {
                items.remove(item);
                return;
            }
        }

    }

    public void editItem(int id, String fieldName, Object newValue) {
        MediaItem itemToEdit = getItemById(id);
        switch (fieldName) {
            case "TITLE":
                itemToEdit.setTitle((String) newValue);
                break;
            case "AUTHOR":
                itemToEdit.setAuthor((String) newValue);
                break;
            case "DATE":
                itemToEdit.setDate((LocalDate) newValue);
                break;
        }
    }

    public int size() {
        return items.size();
    }

}
