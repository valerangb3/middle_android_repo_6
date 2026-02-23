package ru.yandexpraktikum.all_notes.di

import dagger.Component
import ru.yandexpraktikum.all_notes.presentation.AllNotesViewModelFactory
import ru.yandexpraktikum.core.di.CoreComponent

@AllNotesScope
@Component(
    modules = [AllNotesModule::class],
    dependencies = [CoreComponent::class]
)
interface AllNotesComponent {
    fun allNotesViewModelFactory(): AllNotesViewModelFactory

    @Component.Factory
    interface Factory {
        fun create(coreComponent: CoreComponent): AllNotesComponent
    }
}