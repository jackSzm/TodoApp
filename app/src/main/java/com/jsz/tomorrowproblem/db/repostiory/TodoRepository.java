package com.jsz.tomorrowproblem.db.repostiory;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.jsz.tomorrowproblem.db.data.Todo;

import java.util.List;

@Dao
public interface TodoRepository {
    @Query("SELECT * FROM user")
    List<Todo> getAll();

    @Insert
    void insert(Todo todo);
}
