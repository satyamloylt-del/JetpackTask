package com.example.jetpacktask.ui.screen.labtest.component.topbookedhealthcheckup

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.jetpacktask.R
import com.example.jetpacktask.model.TopBookedHealthCheckup
import com.example.jetpacktask.ui.theme.MontserratFontFamily

@Composable
fun TopBookedPackage() {
    val viewmodel:TopPackageBookedViewModel= viewModel(factory = TopBookedPackageFactory(TopBookedRepository()))
    val data=viewmodel._topBookedLiveData.observeAsState(emptyList())

    LaunchedEffect(Unit) {
        viewmodel.getTopPackage()
    }

    LazyRow(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        items(data.value){item->
            TopBookedCard(item)
        }
    }
}



@Composable
fun TopBookedCard(data: TopBookedHealthCheckup) {
    Box(
        modifier = Modifier
            .width(335.dp)
            .padding(start = 8.dp, end = 8.dp)
            .wrapContentHeight()
            .background(color = Color.White, shape = RoundedCornerShape(12.dp))
            .border(
                width = 1.dp,
                color = colorResource(R.color.lightGreen),
                shape = RoundedCornerShape(12.dp)
            )
    ) {
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 8.dp)) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Box(
                    modifier = Modifier
                        .padding(12.dp)
                        .background(
                            color = colorResource(R.color.lightGreens),
                            shape = RoundedCornerShape(16.dp)
                        )
                ) {
                    Text(
                        data.gender,
                        color = Color.Black,
                        modifier = Modifier.padding(6.dp),
                        fontFamily = MontserratFontFamily,
                        fontSize = 12.sp
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Box(
                    modifier = Modifier
                        .background(
                            color = colorResource(R.color.lightGreen),
                            shape = RoundedCornerShape(bottomStart = 12.dp, topEnd = 12.dp)
                        )
                ) {
                    Text(
                        "Packages",
                        color = Color.White,
                        modifier = Modifier.padding(
                            start = 12.dp,
                            end = 12.dp,
                            top = 8.dp,
                            bottom = 8.dp
                        ),
                        fontFamily = MontserratFontFamily,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 12.sp
                    )
                }
            }
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                data.packageName,
                color = Color.Black,
                fontFamily = MontserratFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
                lineHeight = 14.sp,
                modifier = Modifier.padding(start = 12.dp, end = 30.dp)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                        append("Test included: ")
                    }
                    append(data.testIncludedwithDescritpion)
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                        append("+88 more")
                    }
                },
                color = Color.Black,
                fontFamily = MontserratFontFamily,
                fontSize = 10.sp,
                lineHeight = 14.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 12.dp, end = 30.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp)
                    .wrapContentHeight()
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .wrapContentHeight(), horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(R.drawable.totaltest),
                        contentDescription = null,
                        modifier = Modifier.size(25.dp)
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                       data.totalTest,
                        color = Color.Black,
                        fontFamily = MontserratFontFamily,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = TextAlign.Center,
                        fontSize = 10.sp,
                        lineHeight = 14.sp
                    )
                }

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .wrapContentHeight(), horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(R.drawable.report),
                        contentDescription = null,
                        modifier = Modifier.size(25.dp)
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        data.reportavailable,
                        color = Color.Black,
                        fontFamily = MontserratFontFamily,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = TextAlign.Center,
                        fontSize = 10.sp,
                        lineHeight = 14.sp
                    )
                }


                Column(
                    modifier = Modifier
                        .weight(1f)
                        .wrapContentHeight(), horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(R.drawable.fasting),
                        contentDescription = null,
                        modifier = Modifier.size(25.dp)
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        data.fastingRequired,
                        color = Color.Black,
                        fontFamily = MontserratFontFamily,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = TextAlign.Center,
                        fontSize = 10.sp,
                        lineHeight = 14.sp
                    )
                }
            }
            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 8.dp, end = 8.dp)
            ) {
                Column(modifier = Modifier
                    .weight(1.3f)
                    .wrapContentHeight()) {
                    Row(modifier = Modifier.wrapContentSize()) {
                        Text(
                            data.totalPrice,
                            color = Color.Black,
                            fontFamily = MontserratFontFamily,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            fontSize = 16.sp,
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            data.totalSaved,
                            color = Color.Red,
                            fontFamily = MontserratFontFamily,
                            textDecoration = TextDecoration.LineThrough,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            fontSize = 14.sp,
                        )
                    }
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        "Or Pay ₹ 950 with Annual plan.",
                        color = Color.Black,
                        fontFamily = MontserratFontFamily,
                        fontWeight = FontWeight.Normal,
                        lineHeight = 14.sp,
                        textAlign = TextAlign.Start,
                        fontSize = 10.sp,
                    )
                }
                Button(
                    onClick = {

                    },
                    modifier = Modifier
                        .weight(1f)
                        .height(40.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(R.color.darkGreen)
                    ),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "Book Now",
                            color = Color.White,
                            fontFamily = MontserratFontFamily,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 10.sp
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Icon(Icons.Default.ArrowForward, tint = Color.White, contentDescription = null, modifier = Modifier.size(20.dp))
                    }
                }
            }

        }
    }
}