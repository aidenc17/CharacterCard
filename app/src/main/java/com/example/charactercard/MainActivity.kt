package com.example.charactercard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.charactercard.ui.theme.CharacterCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CharacterCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize(), content = { innerPadding ->


                })
            }
        }
    }
}
@Composable
fun CardImage() {
//    CardType()
//    CardTextStats()
//    TitleCost()
}

@Composable
fun CardType(){

}
@Composable
fun CardTextStats(){

}
@Composable
fun TitleCost() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .border(1.dp, Color.Black)
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Rocket Racoon",
            fontSize = 16.sp
        )
        Row(
            horizontalArrangement = Arrangement.End,
            modifier = Modifier.width(IntrinsicSize.Min) // stackoverflow, ran into icon image
            // alignment issue when using the Arrangement.End modifier, it split into three instead of 1 and 1
        ) {
            Text(
                text = "5",
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.width(7.dp)) // Adds spacing between number and icon

            Icon(
                imageVector = Icons.Filled.Build,
                contentDescription = "Wrench",
                modifier = Modifier.size(16.dp)
            )
        }
    }
}


@Composable
@Preview(showBackground = true)
    fun TitleCostPreview() {
    TitleCost()

    //@Preview(showBackground = true)
    @Composable
    fun CharacterCardPreview() {
        Row {

        }
        CharacterCardTheme {

        }
    }
}