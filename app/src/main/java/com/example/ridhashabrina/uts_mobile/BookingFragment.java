package com.example.ridhashabrina.uts_mobile;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class BookingFragment extends Fragment {
    public BookingFragment() {
        // Required empty public constructor
    }

    ListView list;
    String[] NamaMeja = {
            "Number 1",
            "Number 2",
            "Number 3",
            "Number 4",
            "Number 5",
            "Number 6"
    };

    Integer[] GbrMeja = {
            R.drawable.icon_meja,
            R.drawable.icon_meja,
            R.drawable.icon_meja,
            R.drawable.icon_meja,
            R.drawable.icon_meja,
            R.drawable.icon_meja
    };

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_booking, container, false);
        list = (ListView) view.findViewById(R.id.list);

        SeatAdapter adapter = new SeatAdapter(getActivity(), NamaMeja, GbrMeja);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String Pilihitem = NamaMeja[+position];
                Toast.makeText(getActivity(), Pilihitem, Toast.LENGTH_SHORT).show();

            }
        });

        // Inflate the layout for this fragment
        return view;
    }

}