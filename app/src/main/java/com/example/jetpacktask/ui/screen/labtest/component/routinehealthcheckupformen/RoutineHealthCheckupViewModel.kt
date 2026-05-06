package com.example.jetpacktask.ui.screen.labtest.component.routinehealthcheckupformen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.jetpacktask.model.RoutineHealthChekup

class RoutineHealthCheckupViewModel(private val routineHealthChecupForManRepository: RoutineHealthChecupForManRepository) :
    ViewModel() {
    private val routineCheckupData= MutableLiveData<List<RoutineHealthChekup>>()
    var _routineCheckupLiveData : LiveData<List<RoutineHealthChekup>> = routineCheckupData

    fun getTopPackage(){
        routineCheckupData.postValue(
            routineHealthChecupForManRepository.getData()
        )
    }
}


class RoutineHealthCheckupFactory(
    private val repository: RoutineHealthChecupForManRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RoutineHealthCheckupViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return RoutineHealthCheckupViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
