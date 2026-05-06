package com.example.jetpacktask.ui.screen.labtest.component.drcuratedhealtchekuppackage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.jetpacktask.R
import com.example.jetpacktask.model.DrCuratedPackage
import com.example.jetpacktask.ui.theme.MontserratFontFamily

@Composable
fun DrCuratedHealthCheckup() {

    val viewModel: DrCuratedViewModel = viewModel(
        factory = DrCuratedViewModelFactory(DrCuratedRepository())
    )

    val data = viewModel._curetLiveData.observeAsState(emptyList())

    LaunchedEffect(Unit) {
        viewModel.getCuratedData()
    }

    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 12.dp, end = 12.dp)
            .height(320.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        items(data.value) { item ->
            DrCuratedCard(item)
        }
    }
}



@Composable

fun DrCuratedCard(drCuratedPackage: DrCuratedPackage) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .background(
                color = Color(drCuratedPackage.color),
                shape = RoundedCornerShape(12.dp)
            )
            .padding(8.dp)
    ) {

        Text(
            text = drCuratedPackage.text,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = MontserratFontFamily,
            lineHeight = 12.sp,
            modifier = Modifier.align(Alignment.TopStart)
        )

        Image(
            painter = painterResource(drCuratedPackage.image),
            contentDescription = null,
            modifier = Modifier
                .size(80.dp)
                .align(Alignment.BottomEnd)
        )
    }
}
