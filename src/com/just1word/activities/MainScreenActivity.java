package com.just1word.activities;

import java.io.IOException;

import com.just1word.R;
import com.just1word.database.dao.BibleDataSourse;
import com.just1word.database.dao.DatabaseHelper;
import com.just1word.database.entities.Bible;

import android.os.Bundle;
import android.app.Activity;
import android.database.SQLException;
import android.util.Log;
import android.view.Menu;

public class MainScreenActivity extends Activity {
	private BibleDataSourse datasource;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        
        DatabaseHelper myDbHelper = new DatabaseHelper(this);
        myDbHelper = new DatabaseHelper(this);
         
        try {
         
        myDbHelper.createDataBase();
         
        } catch (IOException ioe) {
         
        throw new Error("Unable to create database");
         
        }
         
        try {
         
        myDbHelper.openDataBase();
         
        }catch(SQLException sqle){
         
        throw sqle;
         
        }
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_screen, menu);
        return true;
    }
}


