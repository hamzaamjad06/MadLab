package com.example.hamza.madlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.abdul_wahab.fall173rdlabmad.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // AdapterView
        ListView list1 = (ListView) findViewById(R.id.list1);

        //DataSource
        String strArray[] = {"First","Second","Third"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,strArray);
        list1.setAdapter(arrayAdapter);
    }
}





