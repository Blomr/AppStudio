package com.remcoblom.todolist;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    ListView listView;
    SharedPreferences prefs;
    Set<String> set;
    Set<String> newSet;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.edittext);
        button = (Button) findViewById(R.id.button);
        listView = (ListView) findViewById(R.id.listview);

        prefs = getPreferences(MODE_PRIVATE);
        set = prefs.getStringSet("set", null);
        arrayList = new ArrayList<>();
        if (set != null) {
            for (String string : set) {
                arrayList.add(string);
            }
        }
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getText = String.valueOf(editText.getText());

                if (getText.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Can't make listitem, fill in text", Toast.LENGTH_SHORT).show();
                    return;
                }

                prefs = getPreferences(MODE_PRIVATE);
                set = prefs.getStringSet("set", null);
                newSet = new HashSet<>();

                if (set != null) {
                    newSet = new HashSet<>();
                    for (String string : set) {
                        newSet.add(string);
                    }
                }

                arrayList.add(getText);
                adapter.notifyDataSetChanged();
                newSet.add(getText);
                SharedPreferences.Editor prefsEditor = prefs.edit();
                prefsEditor.putStringSet("set", newSet);
                prefsEditor.apply();
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                String itemClicked = String.valueOf(parent.getItemAtPosition(position));
                arrayList.remove(itemClicked);
                adapter.notifyDataSetChanged();

                newSet = new HashSet<>();
                set = prefs.getStringSet("set", null);
                for (String string : set) {
                    if (!string.equals(itemClicked)) {
                        newSet.add(string);
                    }
                }

                prefs = getPreferences(MODE_PRIVATE);
                SharedPreferences.Editor prefsEditor = prefs.edit();
                prefsEditor.putStringSet("set", newSet);
                prefsEditor.apply();

                return true;
            }
        });
    }
}
