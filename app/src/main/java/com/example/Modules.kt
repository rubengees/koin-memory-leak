package com.example

import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val mainModules = module {
    viewModel { (someParameter: String) -> MainViewModel(someParameter) }
}
