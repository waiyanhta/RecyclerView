package aero.com.recyclerview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import aero.com.recyclerview.Data.FeedItem;
import aero.com.recyclerview.ViewClass.RecyclerAdapter;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    FeedItem feedItem;
    RecyclerAdapter recyclerAdapter;
    List<FeedItem> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Adapter declaration
        list=new ArrayList<>();
        //reference
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        for (int i = 1; i < 11; i++) {
            feedItem=new FeedItem();
            feedItem.setTitle("Reycler Test"+i);
            feedItem.setThumbnail("Thumbnail+i");
            list.add(feedItem);
        }
        recyclerAdapter=new RecyclerAdapter(list, getApplicationContext());
        recyclerView.setAdapter(recyclerAdapter);


    }
}
