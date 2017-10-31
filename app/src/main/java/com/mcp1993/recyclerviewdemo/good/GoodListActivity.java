package com.mcp1993.recyclerviewdemo.good;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Button;

import com.mcp1993.recyclerviewdemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mcp1993 on 2017/10/31.
 */

public class GoodListActivity extends AppCompatActivity implements View.OnClickListener{
    private EmptyRecyclerView goodlist;
    private GoodListAdapter goodListAdapter;
    private Button btn_change;
    private boolean IsGridShow = false;
    private List<String> mList =new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goodlist);
        btn_change = (Button) findViewById(R.id.btn_change);
        btn_change.setOnClickListener(this);
        goodlist = (EmptyRecyclerView) findViewById(R.id.goodlist);
        goodlist.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false));
        goodListAdapter = new GoodListAdapter(GoodListActivity.this);
        goodlist.setAdapter(goodListAdapter);
        initData();
    }

    private void initData(){
        for (int i= 0;i<20;i++){
            mList.add("这是第  "+ i +"  个");
        }
        goodListAdapter.setType(0);
        goodListAdapter.addList(mList);

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_change:
                if (IsGridShow){
                    goodlist.setLayoutManager(new LinearLayoutManager(this,
                            LinearLayoutManager.VERTICAL,false));
                    goodListAdapter.setType(0);
                    goodListAdapter.notifyDataSetChanged();
                    IsGridShow = false;
                }else {
                    goodlist.setLayoutManager(new GridLayoutManager(this,2));
                    goodListAdapter.setType(1);
                    goodListAdapter.notifyDataSetChanged();
                    IsGridShow = true;
                }
                break;
        }
    }
}
