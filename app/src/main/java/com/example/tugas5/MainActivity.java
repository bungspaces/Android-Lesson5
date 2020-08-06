package com.example.tugas5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nmMhs, nim, tempatLahir, txTentang, dTglLahir, dKumpul, tKumpul;
    private RadioButton rbJk1, rbJk2, rbMinat1, rbMinat2, rbMinat3, rbMinat4, rbMinat5, rbMinat6, rbMinat7, rbMinat8, rbMinat9, rbMinat10, rbIpa1, rbIpa2, rbIpa3, rbIpa4;
    private Spinner sAgama;
    private CheckBox cbHobi1, cbHobi2, cbHobi3, cbHobi4, cbHobi5, cbHobi6, cbHobi7, cbHobi8, cbHobi9, cbHobi10, cbHobi11, cbHobi12, cbHobi13, cbHobi14, cbHobi15, cbHobi16, cbHobi17, cbHobi18, cbHobi19, cbHobi20, cbHobi21, cbHobi22, cbHobi23, cbHobi24, cbHobi25, cbIps1, cbIps2, cbIps3, cbIps4;
    String hobi = "Hobi = ";
    String minat = "";
    String ipa = "";
    String ips = "Pelajaran yang disukai = ";
    String data_mhs = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sAgama = (Spinner) findViewById(R.id.spAgama);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sAgama.setAdapter(adapter);
        nmMhs = (EditText) findViewById(R.id.txtNamaMhs);
        nim = (EditText) findViewById(R.id.txtNim);
        rbJk1 = (RadioButton) findViewById(R.id.rbJk1);
        rbJk2 = (RadioButton) findViewById(R.id.rbJk2);
        tempatLahir = (EditText) findViewById(R.id.txtTempatLahir);
        dTglLahir = (EditText) findViewById(R.id.dTglLahir);
        cbHobi1 = (CheckBox) findViewById(R.id.cbHobi1);
        cbHobi2 = (CheckBox) findViewById(R.id.cbHobi2);
        cbHobi3 = (CheckBox) findViewById(R.id.cbHobi3);
        cbHobi4 = (CheckBox) findViewById(R.id.cbHobi4);
        cbHobi5 = (CheckBox) findViewById(R.id.cbHobi5);
        cbHobi6 = (CheckBox) findViewById(R.id.cbHobi6);
        cbHobi7 = (CheckBox) findViewById(R.id.cbHobi7);
        cbHobi8 = (CheckBox) findViewById(R.id.cbHobi8);
        cbHobi9 = (CheckBox) findViewById(R.id.cbHobi9);
        cbHobi10 = (CheckBox) findViewById(R.id.cbHobi10);
        cbHobi11 = (CheckBox) findViewById(R.id.cbHobi11);
        cbHobi12 = (CheckBox) findViewById(R.id.cbHobi12);
        cbHobi13 = (CheckBox) findViewById(R.id.cbHobi13);
        cbHobi14 = (CheckBox) findViewById(R.id.cbHobi14);
        cbHobi15 = (CheckBox) findViewById(R.id.cbHobi15);
        cbHobi16 = (CheckBox) findViewById(R.id.cbHobi16);
        cbHobi17 = (CheckBox) findViewById(R.id.cbHobi17);
        cbHobi18 = (CheckBox) findViewById(R.id.cbHobi18);
        cbHobi19 = (CheckBox) findViewById(R.id.cbHobi19);
        cbHobi20 = (CheckBox) findViewById(R.id.cbHobi20);
        cbHobi21 = (CheckBox) findViewById(R.id.cbHobi21);
        cbHobi22 = (CheckBox) findViewById(R.id.cbHobi22);
        cbHobi23 = (CheckBox) findViewById(R.id.cbHobi23);
        cbHobi24 = (CheckBox) findViewById(R.id.cbHobi24);
        cbHobi25 = (CheckBox) findViewById(R.id.cbHobi25);
        rbMinat1 = (RadioButton) findViewById(R.id.rbMinat1);
        rbMinat2 = (RadioButton) findViewById(R.id.rbMinat2);
        rbMinat3 = (RadioButton) findViewById(R.id.rbMinat3);
        rbMinat4 = (RadioButton) findViewById(R.id.rbMinat4);
        rbMinat5 = (RadioButton) findViewById(R.id.rbMinat5);
        rbMinat6 = (RadioButton) findViewById(R.id.rbMinat6);
        rbMinat7 = (RadioButton) findViewById(R.id.rbMinat7);
        rbMinat8 = (RadioButton) findViewById(R.id.rbMinat8);
        rbMinat9 = (RadioButton) findViewById(R.id.rbMinat9);
        rbMinat10 = (RadioButton) findViewById(R.id.rbMinat10);
        rbIpa1 = (RadioButton) findViewById(R.id.rbIpa1);
        rbIpa2 = (RadioButton) findViewById(R.id.rbIpa2);
        rbIpa3 = (RadioButton) findViewById(R.id.rbIpa3);
        rbIpa4 = (RadioButton) findViewById(R.id.rbIpa4);
        cbIps1 = (CheckBox) findViewById(R.id.cbIps1);
        cbIps2 = (CheckBox) findViewById(R.id.cbIps2);
        cbIps3 = (CheckBox) findViewById(R.id.cbIps3);
        cbIps4 = (CheckBox) findViewById(R.id.cbIps4);

        txTentang = (EditText) findViewById(R.id.txTentang);
        dKumpul = (EditText) findViewById(R.id.dKumpul);
        tKumpul = (EditText) findViewById(R.id.tKumpul);

    }

    public void kirim_data(View view) {
        data_mhs="";
        Toast.makeText(this, "Nama Mahasiswa = "+nmMhs.getText(), Toast.LENGTH_SHORT).show();
        data_mhs += "\nNama Mahasiswa = "+nmMhs.getText().toString();
        hobi = "Hobi = ";
        minat = "";
        ipa = "";
        ips = "Pelajaran yang disukai = ";

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, "NIM = "+nim.getText(), Toast.LENGTH_SHORT).show();
                data_mhs += "\nNIM = "+nim.getText().toString();
            }
        }, 3000);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(rbJk1.isChecked()){
                    Toast.makeText(MainActivity.this, "Jenis Kelamin = "+rbJk1.getText(), Toast.LENGTH_SHORT).show();
                    data_mhs += "\nJenis Kelamin = "+rbJk1.getText().toString();
                }
                else if(rbJk2.isChecked()){
                    Toast.makeText(MainActivity.this, "Jenis Kelamin = "+rbJk2.getText(), Toast.LENGTH_SHORT).show();
                    data_mhs += "\nJenis Kelamin = "+rbJk2.getText().toString();
                }
            }
        }, 6000);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, "Agama = "+ sAgama.getSelectedItem(), Toast.LENGTH_SHORT).show();
                data_mhs += "\nAgama = "+ sAgama.getSelectedItem().toString();
            }
        }, 9000);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, "Tempat Lahir = "+ tempatLahir.getText(), Toast.LENGTH_SHORT).show();
                data_mhs += "\nTempat Lahir = "+ tempatLahir.getText().toString();
            }
        }, 12000);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, "Tanggal Lahir = "+ dTglLahir.getText(), Toast.LENGTH_SHORT).show();
                data_mhs += "\nTanggal Lahir = "+ dTglLahir.getText().toString();
            }
        }, 15000);

        if(cbHobi1.isChecked()){
            hobi += "\n\t- "+cbHobi1.getText();
        }
        if(cbHobi2.isChecked()){
            hobi += "\n\t- "+cbHobi2.getText();
        }
        if(cbHobi3.isChecked()){
            hobi += "\n\t- "+cbHobi3.getText();
        }
        if(cbHobi4.isChecked()){
            hobi += "\n\t- "+cbHobi4.getText();
        }
        if(cbHobi5.isChecked()){
            hobi += "\n\t- "+cbHobi5.getText();
        }
        if(cbHobi6.isChecked()){
            hobi += "\n\t- "+cbHobi6.getText();
        }
        if(cbHobi7.isChecked()){
            hobi += "\n\t- "+cbHobi7.getText();
        }
        if(cbHobi8.isChecked()){
            hobi += "\n\t- "+cbHobi8.getText();
        }
        if(cbHobi9.isChecked()){
            hobi += "\n\t- "+cbHobi9.getText();
        }
        if(cbHobi10.isChecked()){
            hobi += "\n\t- "+cbHobi10.getText();
        }
        if(cbHobi11.isChecked()){
            hobi += "\n\t- "+cbHobi11.getText();
        }
        if(cbHobi12.isChecked()){
            hobi += "\n\t- "+cbHobi12.getText();
        }
        if(cbHobi13.isChecked()){
            hobi += "\n\t- "+cbHobi13.getText();
        }
        if(cbHobi14.isChecked()){
            hobi += "\n\t- "+cbHobi14.getText();
        }
        if(cbHobi15.isChecked()){
            hobi += "\n\t- "+cbHobi15.getText();
        }
        if(cbHobi16.isChecked()){
            hobi += "\n\t- "+cbHobi16.getText();
        }
        if(cbHobi17.isChecked()){
            hobi += "\n\t- "+cbHobi17.getText();
        }
        if(cbHobi18.isChecked()){
            hobi += "\n\t- "+cbHobi18.getText();
        }
        if(cbHobi19.isChecked()){
            hobi += "\n\t- "+cbHobi19.getText();
        }
        if(cbHobi20.isChecked()){
            hobi += "\n\t- "+cbHobi20.getText();
        }
        if(cbHobi21.isChecked()){
            hobi += "\n\t- "+cbHobi21.getText();
        }
        if(cbHobi22.isChecked()){
            hobi += "\n\t- "+cbHobi22.getText();
        }
        if(cbHobi23.isChecked()){
            hobi += "\n\t- "+cbHobi23.getText();
        }
        if(cbHobi24.isChecked()){
            hobi += "\n\t- "+cbHobi24.getText();
        }
        if(cbHobi25.isChecked()){
            hobi += "\n\t- "+cbHobi25.getText();
        }

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, hobi, Toast.LENGTH_SHORT).show();
                data_mhs += "\n"+hobi;
            }
        }, 18000);

        if(rbMinat1.isChecked()){
            minat = rbMinat1.getText().toString();
        }
        else if(rbMinat2.isChecked()){
            minat = rbMinat2.getText().toString();
        }
        else if(rbMinat3.isChecked()){
            minat = rbMinat3.getText().toString();
        }
        else if(rbMinat4.isChecked()){
            minat = rbMinat4.getText().toString();
        }
        else if(rbMinat5.isChecked()){
            minat = rbMinat5.getText().toString();
        }
        else if(rbMinat6.isChecked()){
            minat = rbMinat6.getText().toString();
        }
        else if(rbMinat7.isChecked()){
            minat = rbMinat7.getText().toString();
        }
        else if(rbMinat8.isChecked()){
            minat = rbMinat8.getText().toString();
        }
        else if(rbMinat9.isChecked()){
            minat = rbMinat9.getText().toString();
        }
        else if(rbMinat10.isChecked()){
            minat = rbMinat10.getText().toString();
        }
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, "Tingkat minat Programming Android = "+minat, Toast.LENGTH_SHORT).show();
                data_mhs += "\nTingkat minat Programming Android = "+minat;
            }
        }, 21000);

        if(rbIpa1.isChecked()){
            ipa = rbIpa1.getText().toString();
        }
        else if(rbIpa2.isChecked()){
            ipa = rbIpa2.getText().toString();
        }
        else if(rbIpa3.isChecked()){
            ipa = rbIpa3.getText().toString();
        }
        else if(rbIpa4.isChecked()){
            ipa = rbIpa4.getText().toString();
        }
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, "Pelajaran yang paling disukai = "+ipa, Toast.LENGTH_SHORT).show();
                data_mhs += "\nPelajaran yang paling disukai = "+ipa;
            }
        }, 24000);

        if(cbIps1.isChecked()){
            ips += "\n\t- "+cbIps1.getText().toString();
        }
        if(cbIps2.isChecked()){
            ips += "\n\t- "+cbIps2.getText().toString();
        }
        if(cbIps3.isChecked()){
            ips += "\n\t- "+cbIps3.getText().toString();
        }
        if(cbIps4.isChecked()){
            ips += "\n\t- "+cbIps4.getText().toString();
        }
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, ips, Toast.LENGTH_SHORT).show();
                data_mhs += "\n"+ips;
            }
        }, 27000);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, "Tentang = "+txTentang.getText(), Toast.LENGTH_SHORT).show();
                data_mhs += "\n"+txTentang.getText().toString();
            }
        }, 30000);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, "Tanggal Rencana mengumpulkan tugas ini = "+dKumpul.getText(), Toast.LENGTH_SHORT).show();
                data_mhs += "\nTanggal Rencana mengumpulkan tugas ini = "+dKumpul.getText().toString();
            }
        }, 33000);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, "Jam Rencana mengumpulkan tugas ini = "+tKumpul.getText(), Toast.LENGTH_SHORT).show();
                data_mhs += "\nJam Rencana mengumpulkan tugas ini = "+tKumpul.getText().toString();
            }
        }, 35000);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                intent.putExtra("data_mhs", data_mhs);
                startActivity(intent);
            }
        }, 38000);
    }
}
