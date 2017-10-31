package com.mcp1993.recyclerviewdemo.Model.TypeHoder3;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Administrator on 2016/10/25 0025.
 */

public abstract class TypeBase3ViewHoder<T> extends RecyclerView.ViewHolder{
    public TypeBase3ViewHoder(View itemView) {
        super(itemView);
    }

    public abstract void bindHoder(T dataModel);
}
