package com.mirea.mech.mireaproject.ui.story;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface HistoryDao {
    @Query("SELECT * FROM Cell")
    List<com.mirea.mech.mireaproject.ui.story.Cell> getAll();
    @Query("SELECT * FROM Cell WHERE id = :id")
    com.mirea.mech.mireaproject.ui.story.Cell getById(long id);
    @Insert
    void insert(com.mirea.mech.mireaproject.ui.story.Cell cell);
    @Update
    void update(com.mirea.mech.mireaproject.ui.story.Cell cell);
    @Delete
    void delete(com.mirea.mech.mireaproject.ui.story.Cell cell);

}
