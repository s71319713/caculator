package com.example.caculator.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "note_table")
public class NoteEntity {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id", typeAffinity = ColumnInfo.INTEGER)
    private int id;
    @ColumnInfo(name = "content", typeAffinity = ColumnInfo.TEXT)
    private String content;
    @ColumnInfo(name = "lastUpdate", typeAffinity = ColumnInfo.TEXT)
    private String lastUpdate;

    public NoteEntity(int id, String content, String lastUpdate) {
        this.id = id;
        this.content = content;
        this.lastUpdate = lastUpdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
