package com.ad_coding.noteappcourse.data.mapper

import com.ad_coding.noteappcourse.data.local.entity.NoteEntity
import com.ad_coding.noteappcourse.domain.model.Note

fun NoteEntity.asExternalModel(): Note = Note(
    id, title, content
)

fun Note.toEntity(): NoteEntity = NoteEntity(
    id, title, content
)