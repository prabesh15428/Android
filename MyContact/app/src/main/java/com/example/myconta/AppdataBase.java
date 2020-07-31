package com.example.myconta;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Users.class},version = 1)

public abstract class AppdataBase extends RoomDatabase {
    public abstract UserDao userdDao();
}
