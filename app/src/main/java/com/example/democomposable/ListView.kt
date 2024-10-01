package com.example.democomposable

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun GetPreviewOfData() {
    LazyColumn(content = {
        items(getListData()) {
            ListView(image = it.image, name = it.name, occupation = it.occupation)
        }

    })
}

@Composable
fun ListView(image: Int, name: String, occupation: String) {
    Card(modifier = Modifier
        .padding(5.dp)
        .fillMaxWidth()
        .background(Color(R.color.black)),
        colors = CardDefaults.cardColors(containerColor = Color.Black , contentColor = Color.White)) {
        Row(Modifier.padding(10.dp), verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = image),
                contentDescription = "",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .clickable {}
                    .size(50.dp)
                    .padding(10.dp, 5.dp, 10.dp, 0.dp)
            )
            TextData(name, occupation)
        }
    }

}

@Composable
private fun TextData(name: String, Occupation: String) {
    Log.d("Function Call", "GetListedData: TextData Calling")

    Column {
        Text(
            text = name,
            color = Color.White,
            modifier = Modifier
                .clickable { }
        )
        Text(
            text = Occupation,
            color = Color.Blue,
            modifier = Modifier
                .clickable { }
        )
    }
}

data class ListData(val image: Int, val name: String, val occupation: String)

fun getListData(): MutableList<ListData> {
    val list = mutableListOf<ListData>()
    list.add(
        ListData(
            image = R.drawable.cancel_icon,
            name = "Muhammad Naveed",
            occupation = "Electrical Engr"
        )
    )
    list.add(
        ListData(
            image = R.drawable.blue_heart_icon,
            name = "Muhammad Awais",
            occupation = "Software Engr"
        )
    )
    list.add(
        ListData(
            image = R.drawable.blue_tick_icon,
            name = "Muhammad Waheed",
            occupation = "Accountant"
        )
    )
    list.add(
        ListData(
            image = R.drawable.cargo_truck,
            name = "Muhammad Tanveer",
            occupation = "Business Man"
        )
    )
    list.add(
        ListData(
            image = R.drawable.colorful_chat_icon,
            name = "Muhammad Talha",
            occupation = "Software Engr"
        )
    )
    list.add(
        ListData(
            image = R.drawable.chat_icon,
            name = "Muhammad Shani",
            occupation = "Designer"
        )
    )
    list.add(
        ListData(
            image = R.drawable.cancel_icon,
            name = "Muhammad Naveed",
            occupation = "Electrical Engr"
        )
    )
    list.add(
        ListData(
            image = R.drawable.blue_heart_icon,
            name = "Muhammad Awais",
            occupation = "Software Engr"
        )
    )
    list.add(
        ListData(
            image = R.drawable.blue_tick_icon,
            name = "Muhammad Waheed",
            occupation = "Accountant"
        )
    )
    list.add(
        ListData(
            image = R.drawable.cargo_truck,
            name = "Muhammad Tanveer",
            occupation = "Business Man"
        )
    )
    list.add(
        ListData(
            image = R.drawable.colorful_chat_icon,
            name = "Muhammad Talha",
            occupation = "Software Engr"
        )
    )
    list.add(
        ListData(
            image = R.drawable.chat_icon,
            name = "Muhammad Shani",
            occupation = "Designer"
        )
    )
    list.add(
        ListData(
            image = R.drawable.cancel_icon,
            name = "Muhammad Naveed",
            occupation = "Electrical Engr"
        )
    )
    list.add(
        ListData(
            image = R.drawable.blue_heart_icon,
            name = "Muhammad Awais",
            occupation = "Software Engr"
        )
    )
    list.add(
        ListData(
            image = R.drawable.blue_tick_icon,
            name = "Muhammad Waheed",
            occupation = "Accountant"
        )
    )
    list.add(
        ListData(
            image = R.drawable.cargo_truck,
            name = "Muhammad Tanveer",
            occupation = "Business Man"
        )
    )
    list.add(
        ListData(
            image = R.drawable.colorful_chat_icon,
            name = "Muhammad Talha",
            occupation = "Software Engr"
        )
    )
    list.add(
        ListData(
            image = R.drawable.close_icon,
            name = "Muhammad Shani",
            occupation = "Designer"
        )
    )

    return list
}