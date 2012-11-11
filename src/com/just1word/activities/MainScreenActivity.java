package com.just1word.activities;

import com.just1word.R;
import com.just1word.database.dao.BibleDataSourse;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainScreenActivity extends Activity {
	private BibleDataSourse datasource;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        
        datasource = new BibleDataSourse(this);
        datasource.open();
        Log.d("database","OPEN DB");
        
        if (datasource != null) {
        	Log.d("database","Success");
        	datasource.insert();
        }
        else {
        	Log.d("database","ERROR ");
        }
        
        Log.d("database",datasource.sizeDataBase() + "");
        datasource.close();
        datasource.open();
        Log.d("database",datasource.sizeDataBase() + "");
        datasource.close();
        Log.d("database","CLOSE DB");
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_screen, menu);
        return true;
    }
}


