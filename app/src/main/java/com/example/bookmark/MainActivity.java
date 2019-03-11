package com.example.bookmark;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.bookmark.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<Recycle> listTeks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toolbar diatas RecycleView
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //RecycleView pengaturan
        mRecyclerView = findViewById(R.id.recycler);
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(MainActivity.this, 2);
        mRecyclerView.setLayoutManager(mGridLayoutManager);


        //isi dari RecycleView
        listTeks = new ArrayList<>();
        listTeks.add(new Recycle(R.drawable.child, "Anak Yatim", "Terdapat 12 Ayat", "2 menit yang lalu"));
        listTeks.add(new Recycle(R.drawable.person, "Hijrah", "Terdapat 8 Ayat", "14 menit yang lalu"));
        listTeks.add(new Recycle(R.drawable.womens, "Poligami", "Terdapat 4 Ayat", "2 jam yang lalu"));
        listTeks.add(new Recycle(R.drawable.parents, "Orang Tua", "Terdapat 17 Ayat", "1 hari yang lalu"));
        listTeks.add(new Recycle(R.drawable.nature, "Surga", "Terdapat 28 Ayat", "2 hari yang lalu"));
        listTeks.add(new Recycle(R.drawable.riba, "Harta Riba", "Terdapat 9 Ayat", "1 minggu yang lalu"));

        //adapter dari RecyclerView
       MyAdapter myAdapter = new MyAdapter(MainActivity.this, listTeks);
        mRecyclerView.setAdapter(myAdapter);
    }


    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.opsi_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.item:
                Toast.makeText(this,"Search button selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item1:
                Toast.makeText(this,"Mengurutkan sesuai abdjad",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this,"Mengurutkan sesuai tanggal",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this,"Item dihapus",Toast.LENGTH_SHORT).show();
                return true;
                default:
                    return super.onOptionsItemSelected(item);
        }
    }

}
