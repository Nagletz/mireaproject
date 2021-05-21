package com.mirea.mech.mireaproject.ui.story;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {com.mirea.mech.mireaproject.ui.story.Cell.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract com.mirea.mech.mireaproject.ui.story.HistoryDao storyDao();
}

