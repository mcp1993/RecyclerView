package com.mcp1993.recyclerviewdemo.Model.TypeHoder3;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mcp1993.recyclerviewdemo.Model.DataModelTwo;
import com.mcp1993.recyclerviewdemo.R;


/**
 * Created by Administrator on 2016/10/25 0025.
 */

public class TypeTwoHoder3 extends TypeBase3ViewHoder<DataModelTwo> {

    public ImageView avater;
    public TextView name;
    private TextView content;

    public TypeTwoHoder3(View itemView) {
        super(itemView);
        avater= (ImageView) itemView.findViewById(R.id.avater);
        name= (TextView) itemView.findViewById(R.id.name);
        content= (TextView) itemView.findViewById(R.id.content);
        itemView.setBackgroundColor(Color.RED);
    }
        @Override
    public void bindHoder(DataModelTwo dataModel){

        avater.setBackgroundResource(dataModel.avatarColor);
        name.setText(dataModel.name);
    }
}
