package com.freelancer.msl.core;

import android.app.Application;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;

/**
 * Created by Malek Shefat on 2/24/2018.
 * All rights preserved.
 */

public class MyApp extends Application {

    private FirebaseAuth auth;
    private FirebaseDatabase database;
    private FirebaseStorage storage;

    @Override
    public void onCreate() {
        super.onCreate();
        configureFirebase();
    }

    private void configureFirebase() {
        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();
        storage = FirebaseStorage.getInstance();
    }

    public FirebaseAuth getAuth() {
        if (auth == null)
            auth = FirebaseAuth.getInstance();
        return auth;
    }

    public FirebaseDatabase getDatabase() {
        if (database == null)
            database = FirebaseDatabase.getInstance();
        return database;
    }

    public FirebaseStorage getStorage() {
        if (storage == null)
            storage = FirebaseStorage.getInstance();
        return storage;
    }
}
