package com.example.melat.seekbarandstyles;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.preference.PreferenceManager;
import android.content.Intent;
import android.content.SharedPreferences;

public class MainActivity extends Activity implements SeekBar.OnSeekBarChangeListener {
    private TextView textView1;
    private SeekBar seekBar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //get references

        textView1 = (TextView)findViewById(R.id.textView1);

        seekBar1 = (SeekBar) findViewById(R.id.seekBar1);



        seekBar1.setOnSeekBarChangeListener(this);
    }

    @Override

    public void onProgressChanged(SeekBar seekBar1, int progress, boolean b) {

        Toast.makeText(getApplicationContext(), "volume:   " + progress, Toast.LENGTH_SHORT).show();

        textView1.setText("Volume: " + progress);


    }

    @Override

    public void onStartTrackingTouch(SeekBar seekBar1) {

        Toast.makeText(getApplicationContext(), "volume:   ", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar1) {

    }


    public void displaySettings(View view) {



        startActivity( new Intent(this, SettingsActivity.class));



    }



    public void readSettings(View view) {



        //read the value (stored in strings.xml)

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);

        String setting1 = prefs.getString("example_text", "Joe Smith");



        Toast.makeText(this, setting1, Toast.LENGTH_LONG).show();





    }

}
