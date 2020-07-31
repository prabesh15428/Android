package com.example.myconta;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return  inflater.inflate(R.layout.fragment_2,container,false);




    }
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i("life","fragment on attach");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("life","fragment 2 created");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("life","fragment 2 Destory");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("life","fragment 2 resume");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("life","fragment 2 on create");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("life","fragment 2 on start");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("life","fragment 2 on destory");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("life","fragment 2 on stop");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("life","fragment 2 pause");
    }
}
