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

public class TypeThreeHoder extends TypeBaseViewHoder {

    public ImageView avater;
    public TextView name;
    public TextView content;
    public ImageView iv;


    public TypeThreeHoder(View itemView) {
        super(itemView);
        avater= (ImageView) itemView.findViewById(R.id.avater);
        name= (TextView) itemView.findViewById(R.id.name);
        content= (TextView) itemView.findViewById(R.id.content);
        iv= (ImageView) itemView.findViewById(R.id.iv);
        itemView.setBackgroundColor(Color.YELLOW);


    }
    @Override
    public void bindHoder(DataModel dataModel){

        avater.setBackgroundResource(dataModel.avatarColor);
        name.setText(dataModel.name);
        content.setText(dataModel.content);
        iv.setBackgroundResource(dataModel.contentColor);
    }
}
