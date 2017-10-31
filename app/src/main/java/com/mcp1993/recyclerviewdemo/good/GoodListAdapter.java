package com.mcp1993.recyclerviewdemo.good;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mcp1993.recyclerviewdemo.Model.TypeHoder.DataModel;
import com.mcp1993.recyclerviewdemo.Model.TypeHoder2.TypeOneHoder;
import com.mcp1993.recyclerviewdemo.Model.TypeHoder2.TypeThreeHoder;
import com.mcp1993.recyclerviewdemo.Model.TypeHoder2.TypeTwoHoder;
import com.mcp1993.recyclerviewdemo.R;
import com.mcp1993.recyclerviewdemo.TypeBaseViewHoder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/25 0025.
 */

public class GoodListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private LayoutInflater layoutInflater;
    private List<String> mList =new ArrayList<>();
    private int type;

    public GoodListAdapter(Context context ) {
        layoutInflater=LayoutInflater.from(context);
    }

    public void addList(List<String> list){
        mList.addAll(list);
        notifyDataSetChanged();

    }
    //点击切换布局的时候通过这个方法设置type
    public void setType(int type) {
        this.type = type;
        notifyDataSetChanged();
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View baseView;
        if (viewType == 0) {
            baseView = LayoutInflater.from(parent.getContext()).inflate(R.layout.goodslist_item, parent, false);
            LinearViewHolder linearViewHolder = new LinearViewHolder(baseView);
            return linearViewHolder;
        } else {
            baseView = LayoutInflater.from(parent.getContext()).inflate(R.layout.goodsgrid_item, parent, false);
            GridViewHolder gridViewHolder = new GridViewHolder(baseView);
            return gridViewHolder;
        }
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        int viewType=getItemViewType(position);
        switch (viewType){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
    }

    @Override
    public int getItemViewType(int position) {
        return type;
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class LinearViewHolder extends RecyclerView.ViewHolder{

        public LinearViewHolder(View itemView) {
            super(itemView);
        }
    }

    class GridViewHolder extends RecyclerView.ViewHolder{

        public GridViewHolder(View itemView) {
            super(itemView);
        }
    }
}
