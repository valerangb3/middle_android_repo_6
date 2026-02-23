package ru.yandexpraktikum.add_note.di

import dagger.Component
import ru.yandexpraktikum.add_note.presentation.AddNoteViewModelFactory
import ru.yandexpraktikum.core.di.CoreComponent

@AddNoteScope
@Component(
    modules = [AddNoteModule::class],
    dependencies = [CoreComponent::class]
)
interface AddNoteComponent {
    fun addNoteViewModelFactory(): AddNoteViewModelFactory

    @Component.Factory
    interface Factory {
        fun create(coreComponent: CoreComponent): AddNoteComponent
    }
}