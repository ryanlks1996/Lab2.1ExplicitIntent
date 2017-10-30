package my.edu.tarc.lab21explicitintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView textViewMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        textViewMessage = (TextView) findViewById(R.id.textViewMessage);

        //Identify the intent that trigger this activity
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.MESSAGE);
        textViewMessage.setText(message);
    }

    public void closeActivity(View view){
        finish();  //to terminate an activity
    }
}
