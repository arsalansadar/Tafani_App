package com.arsenic.timeout.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.arsenic.timeout.Activities.Discount;
import com.arsenic.timeout.Activities.Event;
import com.arsenic.timeout.Activities.Gallery;
import com.arsenic.timeout.Activities.Login;
import com.arsenic.timeout.Activities.MainActivity;
import com.arsenic.timeout.Activities.OnlineOrder;
import com.arsenic.timeout.Activities.Promotion;
import com.arsenic.timeout.Activities.Registration;
import com.arsenic.timeout.Activities.Reservation;
import com.arsenic.timeout.MainFunction;
import com.arsenic.timeout.R;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder>{

    MainFunction[] mainFunctions;
    Context context;
    public MainAdapter(MainFunction[] mainFunctions, MainActivity activity) {
        this.mainFunctions = mainFunctions;
        this.context = activity;

    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.single_mainview,parent,false);
        MainViewHolder viewHolder = new MainViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        final MainFunction mainFunction = mainFunctions[position];
        holder.textView.setText(mainFunction.getOperationName());
        holder.imageView.setImageResource(mainFunction.getOperationImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Context context = v.getContext();
                    if(holder.getAdapterPosition()==0){
                        Intent intent = new Intent(context, OnlineOrder.class);
                        context.startActivity(intent);
                    }else if(holder.getAdapterPosition()==1){
                        Intent intent= new Intent(context, Reservation.class);
                        context.startActivity(intent);
                    }else if(holder.getAdapterPosition()==2){
                        Intent intent= new Intent(context, Event.class);
                        context.startActivity(intent);
                    }
                   else if(holder.getAdapterPosition()==3){
                        Intent intent= new Intent(context, Promotion.class);
                        context.startActivity(intent);
                    }
                    else if(holder.getAdapterPosition()==4){
                        Intent intent= new Intent(context, Gallery.class);
                        context.startActivity(intent);
                    }
                    else if(holder.getAdapterPosition()==5){
                        Intent intent= new Intent(context, Discount.class);
                        context.startActivity(intent);
                    }
                    /*
                    else if(holder.getAdapterPosition()==6){
                        Intent intent= new Intent(context, OnlineOrderActivity.class);
                        context.startActivity(intent);
                    }
                    else if(holder.getAdapterPosition()==7){
                        Intent intent= new Intent(context, ReservationActivity.class);
                        context.startActivity(intent);
                    }
                    else if(holder.getAdapterPosition()==8){
                        Intent intent= new Intent(context, MapsActivity.class);
                        context.startActivity(intent);
                    }
                    else if(holder.getAdapterPosition()==9){
                        Intent intent= new Intent(context, SocialActivity.class);
                        context.startActivity(intent);
                    }
                    else if(holder.getAdapterPosition()==10){
                        Intent intent = new Intent();
                        intent.setType("image/*");
                        intent.setAction(Intent.ACTION_GET_CONTENT);
                        context.startActivity(intent);
                    }
                    else if(holder.getAdapterPosition()==11){
                        Intent intent= new Intent(Intent.ACTION_DIAL);
                        context.startActivity(intent);
                    }
                    else if(holder.getAdapterPosition()==12){
                        Intent intent= new Intent(context, ContactActivity.class);
                        context.startActivity(intent);
                    }*/

                }


        });

    }

    @Override
    public int getItemCount() {
        return mainFunctions.length;
    }

    public class MainViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.operstionImage);
            textView = (TextView) itemView.findViewById(R.id.operstionName);
        }
    }
}
