package com.arsenic.timeout.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.arsenic.timeout.Adapters.MainAdapter;
import com.arsenic.timeout.MainFunction;
import com.arsenic.timeout.R;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    public static MainActivity mainC;
    RecyclerView recyclerView;
    CardView onlineView, reservationView, enentView, promotionView, galleryView, discountView;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        onlineView = (CardView)findViewById(R.id.cardOnlineOrder);

        recyclerView = (RecyclerView)findViewById(R.id.mainList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        MainFunction[] mainFunctions = new MainFunction[]{
                new MainFunction("Online Order",R.drawable.onlineorder),
                new MainFunction("Reservation",R.drawable.reservation),
                new MainFunction("Event",R.drawable.events),
                new MainFunction("Promotion",R.drawable.promotion),
                new MainFunction("Gallery",R.drawable.gallery),
                new MainFunction("Discount",R.drawable.discount_card)
        };
        MainAdapter mainAdapter = new MainAdapter(mainFunctions,MainActivity.this);
        recyclerView.setAdapter(mainAdapter);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);

        navigationView = (NavigationView) findViewById(R.id.nav);


        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.menu_call:
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        startActivity(intent);
                        break;

                    case R.id.menu_contact:
                        Intent intent1 = new Intent(MainActivity.this,Contact.class);
                        startActivity(intent1);
                        break;

                   case R.id.menu_maps:
                        Intent intent2 = new Intent(MainActivity.this,MapsActivity.class);
                        startActivity(intent2);
                        break;

                    case R.id.menu_about:
                        Intent intent3 = new Intent(MainActivity.this,About.class);
                        startActivity(intent3);
                        break;
                }
                return true;
            }
        });


    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }
}