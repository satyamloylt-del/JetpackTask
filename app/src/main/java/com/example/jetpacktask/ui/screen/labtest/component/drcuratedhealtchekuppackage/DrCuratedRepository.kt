package com.example.jetpacktask.ui.screen.labtest.component.drcuratedhealtchekuppackage

import com.example.jetpacktask.R
import com.example.jetpacktask.model.DrCuratedPackage

class DrCuratedRepository {


        fun getData(): List<DrCuratedPackage> {
            return listOf(
                DrCuratedPackage("Full Body Checkup", 0x1E828140, R.drawable.fullbodycheckupimage),
                DrCuratedPackage("Diabetes", 0x1FF28068, R.drawable.diabities),
                DrCuratedPackage("Hair & Skin Care", 0x1E828140, R.drawable.skinandcare),
                DrCuratedPackage("Vitamins", 0x1FF28068, R.drawable.vitamin),
                DrCuratedPackage("Fever & Infection", 0x1E828140, R.drawable.fever),
                DrCuratedPackage("Thyroid", 0x1FF28068, R.drawable.thyroid),
            )

    }
}