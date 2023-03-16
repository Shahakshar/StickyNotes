package com.example.notes.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.notes.feature_note.domain.model.Note

@Database(entities = [Note::class], version = 1, exportSchema = false)
abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "note_db"
    }

}