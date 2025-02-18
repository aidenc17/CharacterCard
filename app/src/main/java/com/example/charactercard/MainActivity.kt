package com.example.charactercard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
    TitleCost()
    RocketRacoon()
}

@Composable
fun RocketRacoon(){
    Image(painter = painterResource(id = R.drawable.screenshot_2025_02_13_at_12_44_04pm),
        contentDescription = "Rocket Racoon",
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .border(3.dp, Color.Black),
            alignment = Alignment.Center
        )
}

@Composable
fun CardType(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .border(3.dp, Color.Black)
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "89P13",
            fontSize = 20.sp
        )
        Row(
            horizontalArrangement = Arrangement.End,

        ) {
            Icon(
                imageVector = Icons.Filled.Info,
                contentDescription = "INFO",
                modifier = Modifier.size(25.dp)
            )
        }
    }
}

@Composable
fun CardTextStats() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .border(2.dp, Color.Black)
            .padding(8.dp)
    ) {
        Text(
            text = "When Rocket Raccoon deals damage to an enemy, he plants a hidden explosive on them. At the start of each round, the explosive has a 50% chance to detonate, dealing extra damage. If the enemy takes damage before their turn, the explosive triggers immediately, causing an additional chain reaction that damages nearby targets.",
            fontSize = 16.sp,
            modifier = Modifier.align(Alignment.TopStart)
        )
        Text(
            text = "6/4",
            fontSize = 20.sp,
            modifier = Modifier.align(Alignment.BottomEnd)
        )
    }
}

@Composable
fun TitleCost() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .border(3.dp, Color.Black)
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Rocket Racoon",
            fontSize = 20.sp
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
                modifier = Modifier.size(25.dp)
            )
        }
    }
}


@Composable
//@Preview(showBackground = )
    fun TitleCostPreview() {
    TitleCost()
}

@Composable
//@Preview(showBackground = true)
fun RocketRacoonPreview() {
    RocketRacoon()
}

@Composable
//@Preview(showBackground = true)
fun CardTypePreview() {
    CardType()
}

@Composable
@Preview(showBackground = true)
fun CardTextStatsPreview() {
    CardTextStats()
}

