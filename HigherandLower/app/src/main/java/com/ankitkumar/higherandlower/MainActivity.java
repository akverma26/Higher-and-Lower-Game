package com.ankitkumar.higherandlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;
    Random rand = new Random();
    String dis;

    public void guess (View view){
        EditText number = (EditText)findViewById(R.id.guess);
        int x = Integer.parseInt(number.getText().toString());
        if(x<randomNumber) dis = "Guess Higher !";
        else if(x>randomNumber) dis = "Guess Lower !";
        else {
            dis = "Yeah That's Right !!! Congratulations !!!";
            randomNumber = rand.nextInt(100) + 1;
        }
        Toast.makeText(MainActivity.this, dis , Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        randomNumber = rand.nextInt(100)+1;
    }

}
