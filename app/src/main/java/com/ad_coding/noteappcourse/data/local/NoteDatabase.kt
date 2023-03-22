package com.ad_coding.noteappcourse.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ad_coding.noteappcourse.data.local.dao.NoteDao
import com.ad_coding.noteappcourse.data.local.entity.NoteEntity

@Database(
    version = 1,
    entities = [NoteEntity::class]
)
abstract class NoteDatabase: RoomDatabase() {

    abstract val dao: NoteDao

    companion object {
        const val name = "note_db"
    }
}