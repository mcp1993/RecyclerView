package com.mcp1993.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;


import com.mcp1993.recyclerviewdemo.Model.TypeHoder.DataModel;
import com.mcp1993.recyclerviewdemo.Model.TypeHoder2.TypeOneHoder;
import com.mcp1993.recyclerviewdemo.Model.TypeHoder2.TypeThreeHoder;
import com.mcp1993.recyclerviewdemo.Model.TypeHoder2.TypeTwoHoder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/25 0025.
 */

public class TestAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private LayoutInflater layoutInflater;
    private List<DataModel> mList =new ArrayList<DataModel>();

    public TestAdapter(Context context) {
        layoutInflater=LayoutInflater.from(context);
    }

    public void addList(List<DataModel> list){
        mList.addAll(list);

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        switch (viewType){
            case DataModel.TYPE_ONE:
                return new TypeOneHoder(layoutInflater.inflate(R.layout.item_type_1,parent,false));
            case DataModel.TYPE_TWO:
                return new TypeTwoHoder(layoutInflater.inflate(R.layout.item_type_2,parent,false));
            case DataModel.TYPE_THREE:
                return new TypeThreeHoder(layoutInflater.inflate(R.layout.item_type_3,parent,false));
        }
        return null;
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//        int viewType=getItemViewType(position);
        ((TypeBaseViewHoder)holder).bindHoder(mList.get(position));
//        switch (viewType){
//            case DataModel.TYPE_ONE:
//                ((TypeOneHoder) (holder)).bindHoder(mList.get(position));
//            case DataModel.TYPE_TWO:
//                ((TypeTwoHoder) (holder)).bindHoder(mList.get(position));
//            case DataModel.TYPE_THREE:
//                ((TypeThreeHoder) (holder)).bindHoder(mList.get(position));
//        }
    }

    @Override
    public int getItemViewType(int position) {
        return mList.get(position).type;
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
