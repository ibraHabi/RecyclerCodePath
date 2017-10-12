package com.ibra.recyclercodepath;

import java.util.ArrayList;

/**
 * Created by Biz on 9/17/2017.
 */

public class Contact {
    private static int lastContactId = 0;
    private String mName;
    private boolean mOnline;

    public Contact(String name, boolean online) {
        mName = name;
        mOnline = online;
    }

    public static ArrayList<Contact> createContactsList(int numContacts) {

        ArrayList<Contact> contacts = new ArrayList<Contact>();
        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new Contact("Person" + ++lastContactId, i <= numContacts / 2));

        }
        return contacts;

    }

    public String getName() {
        return mName;
    }

    public boolean isOnline() {
        return mOnline;
    }
}
