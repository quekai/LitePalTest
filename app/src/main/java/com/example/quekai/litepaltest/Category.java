package com.example.quekai.litepaltest;

import android.os.ParcelUuid;

import org.litepal.crud.DataSupport;

/**
 * Created by quekai on 2018/10/6.
 */

public class Category extends DataSupport{

    private int id;
    private String categoryName;
    private int categoryCode;

    public void setId(int id){
        this.id = id;
    }

    public void setCategoryName(String categoryName){
        this.categoryName = categoryName;
    }

    public void setCategoryCode (int categoryCode){
        this.categoryCode = categoryCode;
    }
}
