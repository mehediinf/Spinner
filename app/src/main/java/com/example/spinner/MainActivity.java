package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private TextView textView;
    private Button button;
    private String[] countryNames;

    ArrayAdapter<String> arrayAdapter;

    int[] flags = {R.drawable.afghanistan_icon,R.drawable.armenia_icon,R.drawable.azerbaijan_icon,R.drawable.bahrain_icon,
            R.drawable.bangladesh_icon,R.drawable.bhutan_icon,R.drawable.china_icon,R.drawable.indonesia_icon,R.drawable.india_icon,
            R.drawable.iran_icon,R.drawable.iraq_icon,R.drawable.japan_icon,R.drawable.kazakhstan_icon,R.drawable.nepal_icon,
            R.drawable.pakistan_icon,R.drawable.sri_lanka_icon,R.drawable.turkey_icon

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner_Id);
        button = findViewById(R.id.button_id);
        textView = findViewById(R.id.textView_Id);

        countryNames = getResources().getStringArray(R.array.county_names);

        arrayAdapter = new ArrayAdapter<>(MainActivity.this,R.layout.sample_layout,R.id.sample_TextView_Id,countryNames);


        spinner.setAdapter(arrayAdapter);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value = spinner.getSelectedItem().toString();
                textView.setText(value);


            }
        });



    }
}