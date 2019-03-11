package com.milanrupapara.chipdrawable;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.chip.Chip;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RelativeLayout rlEntry;
    private TextView entry;
    private LinearLayout llchipEntry;
    private Chip entryOne,entryTwo,entryThree,entryFour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chip_drawble);
        entryOne=findViewById(R.id.entryOne);
        entryTwo=findViewById(R.id.entryTwo);
        entryThree=findViewById(R.id.entryThree);
        entryFour=findViewById(R.id.entryFour);
       handleEntry();
    }

    private void handleEntry() {
        entryOne.setOnCloseIconClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entryOne.setVisibility(View.GONE);
            }
        });
        entryTwo.setOnCloseIconClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entryTwo.setVisibility(View.GONE);
            }
        });
        entryThree.setOnCloseIconClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entryThree.setVisibility(View.GONE);
            }
        });
        entryFour.setOnCloseIconClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entryFour.setVisibility(View.GONE);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.refresh:
                 entryOne.setVisibility(View.VISIBLE);
                 entryTwo.setVisibility(View.VISIBLE);
                 entryThree.setVisibility(View.VISIBLE);
                 entryFour.setVisibility(View.VISIBLE);
                break;
        }
        return true;
    }

    @Override
    public void onClick(View view) {
     switch (view.getId()){
         case R.id.entryOne:
             break;
         case R.id.entryTwo:
             break;
         case  R.id.entryThree:
             break;
         case R.id.entryFour:
             break;
     }
    }
}
