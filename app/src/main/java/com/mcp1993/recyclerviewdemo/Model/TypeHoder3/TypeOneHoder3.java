package com.mcp1993.recyclerviewdemo.Model.TypeHoder3;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mcp1993.recyclerviewdemo.Model.DataModelOne;
import com.mcp1993.recyclerviewdemo.R;


/**
 * Created by Administrator on 2016/10/25 0025.
 */

public class TypeOneHoder3 extends TypeBase3ViewHoder<DataModelOne> {

    public ImageView avater;
    public TextView name;

    public TypeOneHoder3(View itemView) {
        super(itemView);
        avater= (ImageView) itemView.findViewById(R.id.avater);
        name= (TextView) itemView.findViewById(R.id.name);
        itemView.setBackgroundColor(Color.BLUE);
    }
        @Override
    public void bindHoder(DataModelOne dataModel){

        avater.setBackgroundResource(dataModel.avatarColor);
        name.setText(dataModel.name);
    }
}
