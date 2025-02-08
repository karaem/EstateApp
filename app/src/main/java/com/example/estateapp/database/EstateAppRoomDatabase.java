package com.example.estateapp.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.estateapp.model.User;


@Database(entities = {User.class}, version = 1)
public abstract class EstateAppRoomDatabase extends RoomDatabase {
    private static EstateAppRoomDatabase instance;
    public abstract UserDao userDao();

    public static synchronized EstateAppRoomDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                            EstateAppRoomDatabase.class, "state_app_database")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()  // Avoid this in production, use background thread
                    .build();
        }
        return instance;
    }
}
