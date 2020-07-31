package com.example.myconta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import java.util.List;

public class Activity2 extends AppCompatActivity {
    String name,address;
    String id,number;
    EditText e1,e2,e3,e4;
    List<Users> userList;
    Button done;
    RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documents);

        e1=findViewById(R.id.key);
        e2=findViewById(R.id.name);
        e3=findViewById(R.id.address);
        e4=findViewById(R.id.number);
        done=findViewById(R.id.done);



        final AppdataBase db = Room.databaseBuilder(getApplicationContext(),
                AppdataBase.class, "database-name").allowMainThreadQueries().build();




//        recyclerAdapter=new RecyclerAdapter(getBaseContext(),UserList);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id=e1.getText().toString();
                name=e2.getText().toString();
                address=e3.getText().toString();
                number=e4.getText().toString();
                int id2=Integer.parseInt(id);
                int number2=Integer.parseInt(number);

                db.userdDao().insertAll(new Users(id2,name,address,number2));
                Intent i=new Intent(getBaseContext(),MainActivity.class);
                i.putExtra("name",name);
                startActivity(i);


            }
        });


    }
}
