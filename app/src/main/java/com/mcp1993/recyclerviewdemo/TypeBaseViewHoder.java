package com.mcp1993.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.mcp1993.recyclerviewdemo.Model.TypeHoder.DataModel;


/**
 * Created by Administrator on 2016/10/25 0025.
 */

public abstract class TypeBaseViewHoder extends RecyclerView.ViewHolder{
    public TypeBaseViewHoder(View itemView) {
        super(itemView);
    }

    public abstract void bindHoder(DataModel dataModel);
}
