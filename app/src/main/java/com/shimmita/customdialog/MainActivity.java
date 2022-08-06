package com.shimmita.customdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText_username,editText_password;
    Button button_show_custom_dialog;
    TextView results_display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText_password=findViewById(R.id.editText_password);
        editText_username=findViewById(R.id.editText_username);
        results_display=findViewById(R.id.textviewDisplay);
        button_show_custom_dialog=findViewById(R.id.button);

        button_show_custom_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               customViewDialogCall();
               results_display.setVisibility(View.INVISIBLE);
            }
        });
    }

    private void customViewDialogCall() {
        CustomDialogClass customDialogClass=new CustomDialogClass();
        customDialogClass.show(getSupportFragmentManager(),"anytext null too");
    }
}