package com.example.jetpacktask.ui.screen.labtest.component.searchbar

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpacktask.R


@Preview(showBackground = true)
@Composable
fun SearchBar() {

    var searchTxt by remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(54.dp)
            .padding(start = 12.dp, end = 12.dp)
            .background(color = Color.White, shape = RoundedCornerShape(16.dp))
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Icon(
                Icons.Default.Search,
                contentDescription = "search",
                modifier = Modifier.size(20.dp)
                    .align(Alignment.CenterVertically)
            )
            Spacer(modifier = Modifier.width(4.dp))
            TextField(
                value = searchTxt, onValueChange = {
                    searchTxt = it
                }, modifier = Modifier
                    .weight(7f)
                    .fillMaxHeight().padding(0.dp), placeholder = {
                    Text("Search for \"X-Ray\" ", fontSize = 14.sp, color = Color.Black)
                }, colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent,
                    cursorColor = Color.Black
                ),
                maxLines = 1
            )
            VerticalDivider(modifier = Modifier.padding(top = 3.dp, bottom = 3.dp))
            Spacer(modifier = Modifier.width(8.dp))
            Image(
                painterResource(R.drawable.micimage),
                contentDescription = "search",
                modifier = Modifier.size(20.dp),
                alignment = Alignment.CenterEnd

            )
            Spacer(modifier = Modifier.width(12.dp))
        }

    }
}