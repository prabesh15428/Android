package com.example.myconta;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    List<Users> lists;
    AppdataBase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = Room.databaseBuilder(getApplicationContext(),
                AppdataBase.class, "database-name").allowMainThreadQueries().build();
        recyclerView=findViewById(R.id.recycler);


        recyclerActivity();

    }

    void recyclerActivity()
    {
        lists  = db.userdDao().getAll();
        Log.i("list of",lists+"");

        LinearLayoutManager layoutManager = new LinearLayoutManager(getBaseContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerAdapter=new RecyclerAdapter(getBaseContext(),lists);

        recyclerView.setAdapter(recyclerAdapter);

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getApplicationContext(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {

                    public void onItemClick(View view, int position) {
                        Intent i=new Intent(getBaseContext(),CheckInfo.class);
                        startActivity(i);
                    }

                    public void onLongItemClick(View view, int position) {
                        Intent i=new Intent(getBaseContext(),CheckInfo.class);
                        startActivity(i);
                    }
                })
        );






    }
}