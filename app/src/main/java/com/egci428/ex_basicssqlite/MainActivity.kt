package com.egci428.ex_basicssqlite

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import com.egci428.ex_basicssqlite.Comment

import java.util.List;
import java.util.Random;


class MainActivity : ListActivity() {

    private var datasource: CommentsDataSource? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //connect the data from the database
    }
}
