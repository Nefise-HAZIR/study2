package com.example.calisma_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;
    ArrayAdapter adapter;
    String item[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list=findViewById(R.id.list);
        item=getResources().getStringArray(R.array.items);
        adapter=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,item);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemName=parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, "you selected "+itemName, Toast.LENGTH_SHORT).show();
            }
        });


    }
}