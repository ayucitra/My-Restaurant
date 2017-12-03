package com.example.user.myrestaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    private RecyclerView rv_list;
    private RestaurantAdapter adapter;
    private List<MenuData> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        setupEnv();
        setupList();
        loadDummyData();
    }



    /**/
    public void setupEnv(){
        rv_list = (RecyclerView) findViewById(R.id.rv_list);
        list = new ArrayList<>();
    }

    /* set listnya */
    public void setupList(){
        adapter = new RestaurantAdapter(list);

        /* tentukan layout listnya */
       // rv_list.setLayoutManager(new GridLayoutManager(this,2));
        rv_list.setLayoutManager(new LinearLayoutManager(this));

        /*isi garis*/
        rv_list.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        /* set adapter */
        rv_list.setAdapter(adapter);

    }


    /* load datanya .... */
    public void loadDummyData(){
        list.add(new MenuData("Nasi Goreng","Rp. 10.000,-"));
        list.add(new MenuData("Cap Cai","Rp. 11.000,-"));
        list.add(new MenuData("Bakso","Rp. 8.000,-"));

        /* memasukan apa yang kita add di variable list */
        adapter.replaceAll(list);
    }




}
