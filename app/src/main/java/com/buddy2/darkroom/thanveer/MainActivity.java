package com.buddy2.darkroom.thanveer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed;
    TextView tx;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed=(EditText)findViewById(R.id.editText);
        tx=(TextView)findViewById(R.id.textView);
        bt=(Button)findViewById(R.id.bt);

    }
    public void clickMe(View v){

        String s=ed.getText().toString();
        tx.setText(s);
    }
}
