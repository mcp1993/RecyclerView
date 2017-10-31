package com.mcp1993.recyclerviewdemo.Model.TypeHoder2;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mcp1993.recyclerviewdemo.Model.TypeHoder.DataModel;
import com.mcp1993.recyclerviewdemo.R;
import com.mcp1993.recyclerviewdemo.TypeBaseViewHoder;


/**
 * Created by Administrator on 2016/10/25 0025.
 */

public class TypeTwoHoder extends TypeBaseViewHoder {

    public ImageView avater;
    public TextView name;
    private TextView content;


    public TypeTwoHoder(View itemView) {
        super(itemView);
        avater= (ImageView) itemView.findViewById(R.id.avater);
        name= (TextView) itemView.findViewById(R.id.name);
        content= (TextView) itemView.findViewById(R.id.content);
        itemView.setBackgroundColor(Color.RED);

    }
    @Override
    public void bindHoder(DataModel dataModel){

        avater.setBackgroundResource(dataModel.avatarColor);
        name.setText(dataModel.name);
        content.setText(dataModel.content);
    }
}
