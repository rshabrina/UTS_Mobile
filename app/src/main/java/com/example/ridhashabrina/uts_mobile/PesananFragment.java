package com.example.ridhashabrina.uts_mobile;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class PesananFragment extends Fragment {
    public static final String intent_nama="nama";
    public static final String intent_detail="detail";
    public static final Integer intent_image=0;

    public static ArrayList<String> datacheckbox = new ArrayList<String>();
    public static ArrayList<Integer> datajumlah = new ArrayList<Integer>();
    public static ArrayList<Double> dataharga = new ArrayList<Double>();


    public PesananFragment() {
        // Required empty public constructor
    }

        String[] NamaPasta = {
                "Cheezy Freezy",
                "Chucky Flucky",
                "Meat Lovers",
                "Mushroom Chunk",
                "Snowy Chip",
                "Sweety Pow"
        };
        Integer[] GbrPasta = {
                R.drawable.p1_cheezyfreezy,
                R.drawable.p2_chuckyflucky,
                R.drawable.p3_meatlover,
                R.drawable.p4_mushroomchunk,
                R.drawable.p5_snowychip,
                R.drawable.p6_sweetypow
        };
        Double[] Harga = {
                19000.0,
                18000.0,
                20000.0,
                15000.0,
                16000.0,
                17000.0
        };
        String[] Detail = {
            "Pasta ini perpaduan 3 jenis keju, cocok buat keju lovers!",
            "Pasta dengan olive oil campur cabe rawit & bombay, tuna plus daun jeruk ini, tiada bandingnya!",
            "Pasta dengan campuran saus, daging dan keju. It's so yummy!",
            "Pasta dengan campuran 3 macam jamur campur saus krim, wow.. pasti luar biasa!",
            "Pasta dengan saus krim dan daging asap ini, pastinya bakal jadi favorit deh!",
            "Pasta dengan perpaduan rasa daging, dan cabe rawit ini. Can't Resist! "
    };

    LinearLayout view;
    Button bOrder;
    CheckBox checkBox;
    ListView list;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            view=(LinearLayout) inflater.inflate(R.layout.fragment_pesanan, container, false);
        // View view = inflater.inflate(R.layout.fragment_pesanan, container, false);
            bOrder=(Button) view.findViewById(R.id.btnOrder);
            checkBox = (CheckBox) view.findViewById(R.id.checkBox);

            list = (ListView) view.findViewById(R.id.list);
            PastaAdapter adapter = new PastaAdapter(getActivity(), NamaPasta, GbrPasta, Harga);
            list.setAdapter(adapter);

            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {

                    Intent intent = new Intent(getActivity(), DetailPasta.class);
                    intent.putExtra(intent_nama,NamaPasta[position]);
                    intent.putExtra(intent_detail,Detail[position]);
                    intent.putExtra(String.valueOf(intent_image), GbrPasta[position]);

                    startActivity(intent);

                }
            });


            bOrder.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // TODO Auto-generated method stub


                    Intent i = new Intent(getActivity(), PembayaranActivity.class);
                    startActivity(i);
                    //Toast.makeText(getActivity(),"Yang dipilih = "+ datacheckbox,Toast.LENGTH_SHORT).show();
                }
            });

            // Inflate the layout for this fragment
            return view;
        }

}