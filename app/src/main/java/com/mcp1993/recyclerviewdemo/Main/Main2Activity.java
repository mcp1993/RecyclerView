package com.mcp1993.recyclerviewdemo.Main;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;


import com.mcp1993.recyclerviewdemo.Model.TypeHoder.DataModel;
import com.mcp1993.recyclerviewdemo.R;
import com.mcp1993.recyclerviewdemo.TestAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * gridview listview 混排
 */
public class Main2Activity extends AppCompatActivity {
    private RecyclerView recyclerView;

    private TestAdapter adapter;

    int colors[] ={R.color.pink,R.color.blue,R.color.violet};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                int type= recyclerView.getAdapter().getItemViewType(position);
                if (type== DataModel.TYPE_THREE){
                    return 2;
                }else {
                    return 1;
                }

            }
        });
        recyclerView.setLayoutManager(gridLayoutManager);
        adapter = new TestAdapter(this);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                GridLayoutManager.LayoutParams params=(GridLayoutManager.LayoutParams)view.getLayoutParams();
                int spanSize =params.getSpanSize();
                int spanIndex =params.getSpanIndex();
                outRect.top=20;
                if(spanSize==20){
                    outRect.left=10;
                }else {
                    outRect.right=10;
                }
            }
        });

        initData();
    }

    private void initData(){
        List<DataModel> datas =new ArrayList<DataModel>();

        for (int i=0;i<30;i++){
            int type ;
            if(i<5||(i>15&&i<20)){
                type=1;
            }else if(i<10||i>25){
                type=2;
            }else {
                type=3;
            }
            DataModel dataModel = new DataModel();
            dataModel.avatarColor=colors[type-1];
            dataModel.type=type;
            dataModel.name="name"+i+"name"+type;
            dataModel.content="content"+i;
            dataModel.contentColor=colors[(type+1)%3];

            datas.add(dataModel);

        }
        adapter.addList(datas);
        adapter.notifyDataSetChanged();
    }
}
