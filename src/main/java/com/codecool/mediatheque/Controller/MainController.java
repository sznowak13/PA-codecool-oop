package com.codecool.mediatheque.Controller;

import com.codecool.mediatheque.Model.IdGenerator;
import com.codecool.mediatheque.notification_system_lib.Notification;
import com.codecool.mediatheque.notification_system_lib.NotificationDispatcher;

public class MainController implements NotificationDispatcher {

    private com.codecool.mediatheque.Model.Warehouse warehouse;
    private com.codecool.mediatheque.View.ViewBrowser browser;
    private com.codecool.mediatheque.Model.User user;
    private IdGenerator idGenerator;

    @Override
    public void dispatch(Notification notification) {

    }
}
