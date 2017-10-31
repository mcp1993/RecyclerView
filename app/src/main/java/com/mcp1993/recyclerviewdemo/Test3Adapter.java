package com.mcp1993.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;


import com.mcp1993.recyclerviewdemo.Model.DataModelOne;
import com.mcp1993.recyclerviewdemo.Model.DataModelThree;
import com.mcp1993.recyclerviewdemo.Model.DataModelTwo;
import com.mcp1993.recyclerviewdemo.Model.TypeHoder.DataModel;
import com.mcp1993.recyclerviewdemo.Model.TypeHoder3.TypeOneHoder3;
import com.mcp1993.recyclerviewdemo.Model.TypeHoder3.TypeThreeHoder3;
import com.mcp1993.recyclerviewdemo.Model.TypeHoder3.TypeTwoHoder3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/25 0025.
 */

public class Test3Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    public static final int TYPE_ONE=1;
    public static final int TYPE_TWO=2;
    public static final int TYPE_THREE=3;
    private LayoutInflater layoutInflater;
    private List<DataModelOne> list1;
    private List<DataModelTwo> list2;
    private List<DataModelThree> list3;


    public Test3Adapter(Context context) {
        layoutInflater=LayoutInflater.from(context);
    }

    public void addList(List<DataModelOne> list1, List<DataModelTwo>list2, List<DataModelThree>list3){
            addListByType(TYPE_ONE,list1);
            addListByType(TYPE_TWO,list2);
            addListByType(TYPE_THREE,list3);

        this.list1=list1;
        this.list2=list2;
        this.list3=list3;

    }



    private List<Integer> types=new ArrayList<>();
    private Map<Integer,Integer> mPositions =new HashMap<>();

    private void addListByType(int type ,List list){

        mPositions.put(type,types.size());
        for (int i=0;i<list.size();i++){
            types.add(type);
        }
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        switch (viewType){
            case DataModel.TYPE_ONE:
                return new TypeOneHoder3(layoutInflater.inflate(R.layout.item_type_1,parent,false));
            case DataModel.TYPE_TWO:
                return new TypeTwoHoder3(layoutInflater.inflate(R.layout.item_type_2,parent,false));
            case DataModel.TYPE_THREE:
                return new TypeThreeHoder3(layoutInflater.inflate(R.layout.item_type_3,parent,false));
        }
        return null;
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        int viewType=getItemViewType(position);
       //每个列表里面的position
        int readPosition=position-mPositions.get(viewType);

        switch (viewType){
            case TYPE_ONE:
                ((TypeOneHoder3)holder).bindHoder(list1.get(readPosition));
                break;
            case TYPE_TWO:
                ((TypeTwoHoder3)holder).bindHoder(list2.get(readPosition));
                break;
            case TYPE_THREE:
                ((TypeThreeHoder3)holder).bindHoder(list3.get(readPosition));
                break;
        }
    }

    @Override
    public int getItemViewType(int position) {
        return types.get(position);
    }

    @Override
    public int getItemCount() {
        return types.size();
    }
}
