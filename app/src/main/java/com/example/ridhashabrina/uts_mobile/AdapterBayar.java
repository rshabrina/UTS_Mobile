package com.example.ridhashabrina.uts_mobile;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

/**
 * Created by Ridha Shabrina on 27/10/2016.
 */

public class AdapterBayar extends ArrayAdapter<String> {


    public final Activity context;
    ArrayList<String> namaArray = new ArrayList<String>();
    ArrayList<Double> hargaArray = new ArrayList<Double>();
    ArrayList<Integer> jumlahArray = new ArrayList<Integer>();



    public AdapterBayar(Activity context, ArrayList namaArray, ArrayList hargaArray,ArrayList jumlahArray)
    {
        super(context,R.layout.list_view2,namaArray);

        this.context=context;
        this.namaArray=namaArray;
        this.hargaArray=hargaArray;
        this.jumlahArray=jumlahArray;



    }
    public View getView(int position, View view, ViewGroup parent)
    {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_pembayaran,null,true);

        TextView nama=(TextView) rowView.findViewById(R.id.txt_nama);
        TextView jumlah=(TextView) rowView.findViewById(R.id.txt_jumlah);
        TextView harga=(TextView) rowView.findViewById(R.id.txt_harga);

        nama.setText(namaArray.get(position));
        harga.setText(String.valueOf(hargaArray.get(position)*jumlahArray.get(position)));
        jumlah.setText(String.valueOf(jumlahArray.get(position)));
        return rowView;
    }
}
