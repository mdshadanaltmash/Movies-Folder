package com.example.mdshaddu07.shadan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;


public class First extends Activity {

    Spinner spinner;
    String[] SPINNERVALUES = {"Horror","Romantic","Sports"};
    String SpinnerValue;
    Button GOTO;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        spinner =(Spinner)findViewById(R.id.spinner);

        GOTO = (Button)findViewById(R.id.button);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(First.this, android.R.layout.simple_list_item_1, SPINNERVALUES);

        spinner.setAdapter(adapter);

        //Adding setOnItemSelectedListener method on spinner.
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                SpinnerValue = (String)spinner.getSelectedItem();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        GOTO.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                switch(SpinnerValue){

                    case "Horror":
                        intent = new Intent(First.this, Second.class);
                        startActivity(intent);
                        break;

                    case "Romantic":
                        intent = new Intent(First.this, Third.class);
                        startActivity(intent);
                        break;

                    case "Sports":
                        intent = new Intent(First.this, Fourth.class);
                        startActivity(intent);
                        break;


                }
            }
        });

    }
}