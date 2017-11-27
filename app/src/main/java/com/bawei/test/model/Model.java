package com.bawei.test.model;

import android.util.Log;

import com.bawei.test.bean.MyBean;
import com.bawei.test.myli.GetRequest_Interface;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 1：类的用途
 * 2：@author 张倩
 * 3:@date 2017/11/15 13:58
 */

public class Model implements IModel {

    private String path = "http://m.yunifang.com/";

    @Override
    public void getData(Observer<MyBean> observer) {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())//新的配置
                .baseUrl(path)
                .build();
        GetRequest_Interface requestInterface = retrofit.create(GetRequest_Interface.class);
        requestInterface.getdata()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);

        HashMap<String, String> map = new HashMap<>();
        map.put("姓名", "张三");
        Set keySet = map.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            Object key = it.next();
            Object value = map.get(key);
            Log.i("xx",key + ":" + value);
        }
    }
}