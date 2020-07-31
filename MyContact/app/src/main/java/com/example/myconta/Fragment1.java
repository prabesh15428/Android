package com.example.myconta;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment1  extends Fragment {
    TextView abc;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_1,container,false);

        String str=getArguments().getString("edittext");

        Button button= view.findViewById(R.id.button);
        abc=view.findViewById(R.id.abc);

//       button.setOnClickListener(new View.OnClickListener()){
//           @Override
//                   public void onClick(View view){
//               startActivity(new Intent(getActivity(),MainActivity.class));
//
//            }
        return view;
    }



    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i("life","fragment on attach");

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("life","fragment1  created");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("life","fragment 1 Destory");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("life","fragment 1 resume");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("life","fragment 1 on create");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("life","fragment 1 on start");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("life","fragment 1 on destory");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("life","fragment 1 on stop");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("life","fragment 1 pause");
    }
}
