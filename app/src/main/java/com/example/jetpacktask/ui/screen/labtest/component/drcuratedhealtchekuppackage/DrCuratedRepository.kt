package com.example.jetpacktask.ui.screen.labtest.component.drcuratedhealtchekuppackage

import com.example.jetpacktask.R
import com.example.jetpacktask.model.DrCuratedPackage

class DrCuratedRepository {


        fun getData(): List<DrCuratedPackage> {
            return listOf(
                DrCuratedPackage("Full Body Checkup", 0x1E828140, R.drawable.fullbodycheckupimage),
                DrCuratedPackage("Full Body Checkup", 0x1FF28068, R.drawable.fullbodycheckupimage),
                DrCuratedPackage("Full Body Checkup", 0x1E828140, R.drawable.fullbodycheckupimage),
                DrCuratedPackage("Full Body Checkup", 0x1FF28068, R.drawable.fullbodycheckupimage),
                DrCuratedPackage("Full Body Checkup", 0x1E828140, R.drawable.fullbodycheckupimage),
                DrCuratedPackage("Full Body Checkup", 0x1FF28068, R.drawable.fullbodycheckupimage),
            )

    }
}