package com.example.notes.feature_note.domain.use_case

import com.example.notes.feature_note.domain.model.InvalidNoteException
import com.example.notes.feature_note.domain.model.Note
import com.example.notes.feature_note.domain.repository.NoteRepository

class AddNoteUseCase(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {

        if(note.title.isBlank()) {
            throw InvalidNoteException("The Title Of The Node Can't Be Empty.")
        }
        if(note.content.isBlank()) {
            throw InvalidNoteException("The Content Of The Node Can't Be Empty.")
        }
        repository.insertNote(note)
    }
}