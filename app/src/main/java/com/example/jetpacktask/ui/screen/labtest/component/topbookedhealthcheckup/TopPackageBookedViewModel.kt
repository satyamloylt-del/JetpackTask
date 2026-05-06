package com.example.jetpacktask.ui.screen.labtest.component.topbookedhealthcheckup

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.jetpacktask.model.TopBookedHealthCheckup

class TopPackageBookedViewModel(private val repository: TopBookedRepository) : ViewModel() {

    private val topBookedData= MutableLiveData<List<TopBookedHealthCheckup>>()
    var _topBookedLiveData : LiveData<List<TopBookedHealthCheckup>> = topBookedData

    fun getTopPackage(){
        topBookedData.postValue(
            repository.getData()
        )
    }
}

class TopBookedPackageFactory(
    private val repository: TopBookedRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TopPackageBookedViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return TopPackageBookedViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

