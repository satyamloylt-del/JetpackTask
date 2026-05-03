package com.example.jetpacktask.ui.screen.labtest.component.drcuratedhealtchekuppackage

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.jetpacktask.R
import com.example.jetpacktask.model.DrCuratedPackage

class DrCuratedViewModel(private val repository: DrCuratedRepository) : ViewModel() {

    private val curatedLiveData= MutableLiveData<List<DrCuratedPackage>>()
    var _curetLiveData : LiveData<List<DrCuratedPackage>> = curatedLiveData

    fun getCuratedData(){
        curatedLiveData.postValue(
            repository.getData()
        )
    }
}

class DrCuratedViewModelFactory(
    private val repository: DrCuratedRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DrCuratedViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return DrCuratedViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

