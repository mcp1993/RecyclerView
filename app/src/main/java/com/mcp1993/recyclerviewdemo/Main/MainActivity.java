package com.mcp1993.recyclerviewdemo.Main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.mcp1993.recyclerviewdemo.Model.TypeHoder.DataModel;
import com.mcp1993.recyclerviewdemo.R;
import com.mcp1993.recyclerviewdemo.TestAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    private TestAdapter adapter;

    int colors[] ={R.color.pink,R.color.blue,R.color.violet};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false));
        adapter = new TestAdapter(this);
        recyclerView.setAdapter(adapter);

        initData();
    }

    private void initData(){
        List<DataModel> datas =new ArrayList<DataModel>();

        for (int i=0;i<20;i++){
            int type = (int)((Math.random()*3)+1);

            DataModel dataModel = new DataModel();
            dataModel.avatarColor=colors[type-1];
            dataModel.type=type;
            dataModel.name="name"+i;
            dataModel.content="content"+i;
            dataModel.contentColor=colors[(type+1)%3];

            datas.add(dataModel);

        }
        adapter.addList(datas);
        adapter.notifyDataSetChanged();
    }
}
