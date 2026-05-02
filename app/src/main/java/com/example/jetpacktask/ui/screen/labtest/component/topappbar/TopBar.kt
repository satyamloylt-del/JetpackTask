package com.example.jetpacktask.ui.screen.labtest.component.topappbar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpacktask.R
import com.example.jetpacktask.ui.theme.MontserratFontFamily


@Preview(showBackground = true)
@Composable
fun Topbar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(55.dp)
            .background(
              color = colorResource(R.color.darkGreen)
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(4f).fillMaxHeight().padding(start = 12.dp, end = 12.dp), verticalArrangement = Arrangement.Center) {
            Row(modifier = Modifier.wrapContentSize()) {
                Icon(
                    Icons.Default.LocationOn,
                    tint = Color.White,
                    contentDescription = "locationicon",
                    modifier = Modifier.size(20.dp)
                )
                Spacer(Modifier.width(2.dp))
                Text("Namaste Ujjwal", style = TextStyle(
                    fontSize = 14.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontFamily = MontserratFontFamily,
                ))
            }
            Spacer(Modifier.width(2.dp))
            Row(modifier = Modifier.fillMaxWidth()) {

                Spacer(Modifier.width(4.dp))
                Text("Rohini,Sec-18,Delhi", style = TextStyle(
                    fontSize = 12.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Normal,
                    fontFamily = MontserratFontFamily,
                ))
                Spacer(Modifier.width(4.dp))
                Icon(
                    Icons.Default.KeyboardArrowDown,
                    tint = Color.White,
                    contentDescription = "down",
                    modifier = Modifier.size(16.dp)
                )
            }
        }

        Row(modifier = Modifier.weight(1.2f).fillMaxHeight(), verticalAlignment = Alignment.CenterVertically) {
            Icon(
                painterResource(R.drawable.notification),
                tint = Color.White,
                contentDescription = "notification",
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Icon(
                painterResource(R.drawable.wallet),
                tint = Color.White,
                contentDescription = "down",
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Icon(
                painterResource(R.drawable.profileicon),
                tint = Color.White,
                contentDescription = "down",
                modifier = Modifier.size(20.dp)
            )

        }
    }
}