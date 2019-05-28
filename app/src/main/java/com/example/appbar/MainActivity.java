package com.example.appbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
               Toolbar myToolbar = findViewById(R.id.my_toolbar);
                  setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_open_notes) {
            Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
            startActivity(intentNotes);
        }

        if (id == R.id.action_settings) {
            Intent intentSettings = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(intentSettings);
        }

        if (id == R.id.action_open_check) {
            Intent intentSettings = new Intent(MainActivity.this, CheckBoxActivity.class);
            startActivity(intentSettings);
        }

        if (id == R.id.action_open_calendar) {
            Intent intentSettings = new Intent(MainActivity.this, CalendarActivity.class);
            startActivity(intentSettings);
        }

        if (id == R.id.action_open_spinner) {
            Intent intentSettings = new Intent(MainActivity.this, SpinnerActivity.class);
            startActivity(intentSettings);
        }
        return super.onOptionsItemSelected(item);
    }


}
