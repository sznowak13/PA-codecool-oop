package com.codecool.mediatheque.View;

import com.codecool.mediatheque.notification_system_lib.Notification;
import com.codecool.mediatheque.notification_system_lib.NotificationDispatcher;
import com.codecool.mediatheque.notification_system_lib.Notifier;

public abstract class MenuScreen implements Showable{

    private Notifier notifier = new Notifier();

    public void addNotificationDispatcher(NotificationDispatcher nd) {
        notifier.addSubscriber(nd);
    }

    public void sendNotification(Notification n) {
        notifier.notify(n);
    }

}
