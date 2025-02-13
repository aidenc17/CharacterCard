package com.example.charactercard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.charactercard.ui.theme.CharacterCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CharacterCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CardImage(

                        //modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
@Composable
fun CardType(){

}
@Composable
fun CardTextStats(){

}
@Composable
fun TitleCost(){

}

@Composable
fun CardImage() {

    }
}




@Preview(showBackground = true)
@Composable
fun CharacterCardPreview() {
    Row {
        
    }
    CharacterCardTheme {

    }
}