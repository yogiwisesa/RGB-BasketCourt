package com.rubydev.basketcourt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Score> list = new ArrayList<>();
    HistoryAdapter historyAdapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inisiasi recycler dan adapter
        recyclerView = findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        historyAdapter = new HistoryAdapter(list, this);
        recyclerView.setAdapter(historyAdapter);


        // data palsu
        list.add(new Score("A","B", 12,30, "30 Septermber 2017"));
        list.add(new Score("A","B", 12,30, "30 Septermber 2017"));
        list.add(new Score("A","B", 12,30, "30 Septermber 2017"));
        list.add(new Score("A","B", 12,30, "30 Septermber 2017"));
        list.add(new Score("A","B", 12,30, "30 Septermber 2017"));
        list.add(new Score("A","B", 12,30, "30 Septermber 2017"));
        list.add(new Score("A","B", 12,30, "30 Septermber 2017"));

        // refresh data palsu
        historyAdapter.notifyItemInserted(list.size());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.addmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(getApplicationContext(), InputActivity.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}
