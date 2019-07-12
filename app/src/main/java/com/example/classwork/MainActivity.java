package com.example.classwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // Get Variables...
                EditText fNameEdit = (EditText)findViewById(R.id.firstName);
                String firstName = fNameEdit.getText().toString();

                EditText lNameEdit = (EditText)findViewById(R.id.firstName);
                String lastName = lNameEdit.getText().toString();

                String fullname = firstName + " " + lastName;

                Toast.makeText(MainActivity.this, fullname, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
