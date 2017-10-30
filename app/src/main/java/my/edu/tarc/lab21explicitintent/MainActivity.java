package my.edu.tarc.lab21explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MESSAGE = "MainActivity.Message" ;
    private EditText editTextMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMessage = (EditText) findViewById(R.id.editTextMessage);
    }

    public void sendMessage(View view){
        //Intent is a message class to transfer an activity to another activity or app
        Intent intent = new Intent(this,ResultActivity.class);
        String message;
        message = editTextMessage.getText().toString();

        //Passing data to an Intent
        //Format: putExtra(Tag,value)
        intent.putExtra(MESSAGE,message);
        startActivity(intent);
    }
}
