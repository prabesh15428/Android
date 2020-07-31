package com.example.myconta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<ContactIDHolder>
{
    Context context;
    List<Users> contactsList;
    public  RecyclerAdapter(Context context, List<Users> contactsList)
    {
        this.context=context;
        this.contactsList=contactsList;



    }

    @NonNull
    @Override
    public ContactIDHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_view,null);
        ContactIDHolder myholder=new ContactIDHolder(layoutView);
        return  myholder;



    }

    @Override
    public void onBindViewHolder(@NonNull ContactIDHolder holder, int position) {
        holder.name.setText(contactsList.get(position).getName());



    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }
}

class ContactIDHolder extends  RecyclerView.ViewHolder
{
    TextView name;


    public ContactIDHolder(@NonNull View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.name);
    }
}