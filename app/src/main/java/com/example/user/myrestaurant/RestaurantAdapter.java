package com.example.user.myrestaurant;

import android.content.Intent;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by User on 03/12/2017.
 */

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ViewHolder> {

    private List<MenuData> list;
    public RestaurantAdapter(List<MenuData> list) {
        this.list = list;
    }



    public void replaceAll(List<MenuData> item){
        list = item;

        /* untuk update data */
        notifyDataSetChanged();
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        /* set sumber data yang ingin ditampilkan */
       return new ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.item_list,parent,false
                )
        );
    }



    /* set sumber data yang di bind */
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    /* banyak data disesuaikan dengan list yang di get */
    @Override
    public int getItemCount() {
        return list.size();
    }




    /* inisialisasi view yang akan menampilkan list */
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txt_namamenu, txt_harga;

        public ViewHolder(View itemView) {
            super(itemView);

            txt_namamenu = (TextView) itemView.findViewById(R.id.txt_namamenu);
            txt_harga = (TextView) itemView.findViewById(R.id.txt_harga);
        }

        /* Setter Data View di XML (Buat class java untuk setter dan getter) */
        public void bind(final MenuData item){
            txt_namamenu.setText(item.getNamamenu());
            txt_harga.setText(item.getHarga());
            //gambar.setBackgroundResource(R.drawable.monkey)



            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(itemView.getContext(), item.getNamamenu(), Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(itemView.getContext(),DetailActivity.class);

                    //seperti post/get dalam web. pass data to other page.
                    intent.putExtra("namamenu",item.getNamamenu());
                    intent.putExtra("harga",item.getHarga());

                    itemView.getContext().startActivity(intent);

                }
            });



        }

    }



}
