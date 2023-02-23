package com.example.caculator.room;

import androidx.lifecycle.MutableLiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.ArrayList;

@Dao
public interface NoteDao {

    @Insert
    void insert(NoteEntity noteEntity);

    @Update
    void update(NoteEntity noteEntity);

    @Delete
    void delete(NoteEntity noteEntity);

    @Query("DELETE FROM note_table")
    void deleteAllNotes();

    @Query("SELECT * FROM note_table")
    MutableLiveData<ArrayList<NoteEntity>> getAllNotes();

//    @Query("SELECT * FROM note_table ")
//    MutableLiveData<ArrayList<Note>> getAllNotes();


}
