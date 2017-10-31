package com.mcp1993.recyclerviewdemo.Model.TypeHoder3;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mcp1993.recyclerviewdemo.Model.DataModelThree;
import com.mcp1993.recyclerviewdemo.R;


/**
 * Created by Administrator on 2016/10/25 0025.
 */

public class TypeThreeHoder3 extends TypeBase3ViewHoder<DataModelThree> {

    public ImageView avater;
    public TextView name;
    public TextView content;
    public ImageView iv;


    public TypeThreeHoder3(View itemView) {
        super(itemView);
        avater= (ImageView) itemView.findViewById(R.id.avater);
        name= (TextView) itemView.findViewById(R.id.name);
        content= (TextView) itemView.findViewById(R.id.content);
        iv= (ImageView) itemView.findViewById(R.id.iv);
        itemView.setBackgroundColor(Color.YELLOW);


    }
    @Override
    public void bindHoder(DataModelThree dataModel){

        avater.setBackgroundResource(dataModel.avatarColor);
        name.setText(dataModel.name);
        content.setText(dataModel.content);
        iv.setBackgroundResource(dataModel.contentColor);
    }
}
