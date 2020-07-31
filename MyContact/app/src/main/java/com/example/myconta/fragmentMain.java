package com.example.myconta;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class fragmentMain extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

    }
    public void onClick1(View v){
        Bundle bundle=new Bundle();
        bundle.putString("edittext","From Activity");

        Fragment1 f1=new Fragment1();
        f1.setArguments(bundle);
        beginTransition(f1);

    }
    public void onClick2(View v)
    {
        beginTransition(new Fragment2());

    }
    public void beginTransition(Fragment fragment)
    {
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fm.beginTransaction();

        fragmentTransaction.replace(R.id.framelayout,fragment);
        fragmentTransaction.commit();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("life","Activity destory called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("life","Activity start called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("life","Activity resume called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("life","Activity stop called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("life","Activity pause called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("life","Activity restart");
    }
}
