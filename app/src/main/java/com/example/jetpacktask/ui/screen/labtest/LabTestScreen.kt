package com.example.jetpacktask.ui.screen.labtest

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpacktask.R
import com.example.jetpacktask.ui.screen.labtest.component.mainservice.MainService
import com.example.jetpacktask.ui.screen.labtest.component.searchbar.SearchBar
import com.example.jetpacktask.ui.screen.labtest.component.topappbar.Topbar


@Preview(showBackground = true)
@Composable
fun LabTestScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            //Top bar
            Topbar()

            //Search bar and background
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(260.dp)
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(
                                colorResource(R.color.darkGreen),
                                colorResource(R.color.lightGreen)
                            )
                        ),
                        shape = RoundedCornerShape(bottomStart = 26.dp, bottomEnd = 26.dp)
                    )
            ) {
                Image(
                    painter = painterResource(R.drawable.researchimage),
                    contentDescription = null,
                    modifier = Modifier
                        .size(140.dp)
                        .align(Alignment.Center)
                )
                Image(
                    painter = painterResource(R.drawable.topbarimage),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )

                Column(modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()

                ) {
                    Spacer(modifier = Modifier.height(12.dp))
                    SearchBar()
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            MainService()



        }
    }
}