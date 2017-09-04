package com.jsz.tomorrowproblem.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.jsz.tomorrowproblem.db.data.Todo;
import com.jsz.tomorrowproblem.db.repostiory.TodoRepository;

@Database(entities = {Todo.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract TodoRepository todoRepository();

}
