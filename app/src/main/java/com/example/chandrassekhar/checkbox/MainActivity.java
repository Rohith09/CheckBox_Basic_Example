package com.example.chandrassekhar.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn_disp;
    RadioGroup rg_gender;
    RadioButton rb_selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {

        rg_gender=(RadioGroup)findViewById(R.id.gender);
        btn_disp=(Button)findViewById(R.id.rb_ok);
        btn_disp.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int sel_id=rg_gender.getCheckedRadioButtonId();
        rb_selected=(RadioButton)findViewById(sel_id);
        Toast.makeText(getApplicationContext(),rb_selected.getText(), Toast.LENGTH_SHORT).show();

    }
}
