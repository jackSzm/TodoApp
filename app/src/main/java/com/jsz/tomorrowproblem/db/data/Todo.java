package com.jsz.tomorrowproblem.db.data;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Todo {

    @PrimaryKey
    private int id;

    @ColumnInfo(name = "title")
    private String title;
}
