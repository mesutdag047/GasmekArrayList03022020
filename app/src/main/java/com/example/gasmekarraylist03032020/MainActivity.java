package com.example.gasmekarraylist03032020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> sehirler=new ArrayList<>();
    EditText yazialani;
    TextView sehir_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yazialani=findViewById(R.id.editText);
        sehir_tv=findViewById(R.id.textView);
        sehirler.add("adana");
        sehirler.add("urfa");

        for(int i=0;i<sehirler.size();i++){

            sehir_tv.append((sehirler.get(i)+"\n"));
        }



       /* ArrayList<String> sehirler=new ArrayList<>();
        sehirler.add("Antep");
        sehirler.add("Adana");
        sehirler.add("Osmaniye");
        sehirler.add("Urfa");

        //System.out.println(sehirler.get(1));
        //System.out.println(sehirler.get(3));

        for (int i=0;i<sehirler.size();i++){
            System.out.println(sehirler.get(i));
        }

        int xsayac=sehirler.size()-1;
        while (xsayac>0){

            System.out.println(sehirler.get(xsayac));
            xsayac--;
        }

        for (int i=sehirler.size()-1;i>=0;i--){
            System.out.println(sehirler.get(i));
        } */


    }

    public void ekle(View view){
        String gelensehir=yazialani.getText().toString();
        if(gelensehir.length()>=3){
            sehirler.add(gelensehir);
            sehir_tv.append(gelensehir+"\n");
            yazialani.setText("");

        }else {
            Toast.makeText(getApplicationContext(),"Lütfen adam olun",Toast.LENGTH_LONG).show();
        }


    }

    public void sil(View view){
        int index=sehirler.size()-1;
        sehirler.remove(index);
        sehir_tv.setText("");
        for (int i=0;i<sehirler.size();i++){
            sehir_tv.append(sehirler.get(i)+"\n");
        }

    }
}
