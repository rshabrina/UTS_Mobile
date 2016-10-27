package com.example.ridhashabrina.uts_mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailPasta extends AppCompatActivity {

    TextView txtID,txtDetail;
    ImageView gmb;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pasta);

        //Inisiasi view
        txtID = (TextView) findViewById(R.id.txtNama);
        txtDetail = (TextView) findViewById(R.id.txtDetail);
        gmb = (ImageView) findViewById(R.id.gmb);

        //getting intent
        Intent intent = getIntent();

        //display value by fetching from intent
        txtID.setText(intent.getStringExtra(PesananFragment.intent_nama));
        Log.d(intent.getStringExtra(PesananFragment.intent_detail), " rtess");
        txtDetail.setText(intent.getStringExtra(PesananFragment.intent_detail));
        gmb.setImageResource(intent.getIntExtra(String.valueOf(PesananFragment.intent_image),0));


    }
}
