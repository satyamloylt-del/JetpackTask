package com.example.jetpacktask.ui.screen.labtest.component.routinehealthcheckupformen

import com.example.jetpacktask.R
import com.example.jetpacktask.model.RoutineHealthChekup

class RoutineHealthChecupForManRepository {

    fun getData():List<RoutineHealthChekup>{
        return listOf(
            RoutineHealthChekup(
                0x1FF28068,
                R.drawable.boyroutineimage,
                "Under 15 yrs"
            ),
            RoutineHealthChekup(
                0x1FF28068,
                R.drawable.abovefif,
                "15-30 yrs"
            ),
            RoutineHealthChekup(
                0x1FF28068,
                R.drawable.abovethir,
                "30-45 yrs"
            )
            ,
            RoutineHealthChekup(
                0x1FF28068,
                R.drawable.oldage,
                "45-60 yrs"
            ),
            RoutineHealthChekup(
                0x1FF28068,
                R.drawable.abovesix,
                "Above 60 yrs"
            ),


        )
    }
}