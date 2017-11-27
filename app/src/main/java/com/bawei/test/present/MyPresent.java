package com.bawei.test.present;

import android.util.Log;

import com.bawei.test.bean.MyBean;
import com.bawei.test.model.Model;
import com.bawei.test.view.Iview;

import rx.Observer;

/**
 * 1：类的用途
 * 2：@author 张倩
 * 3:@date 2017/11/15 14:09
 */

public class MyPresent {
    Iview view;
    Model model;

    public MyPresent(Iview view) {
        this.view = view;
        model=new Model();
    }

    public void show(){
        model.getData(new Observer<MyBean>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                Log.d("xx","sssss"+e.getMessage());
            }

            @Override
            public void onNext(MyBean bean) {
                Log.d("xx", "onNext: "+bean.getCode());
                view.giveData(bean);
               /* //存入greendao
                GBeanDao gBeanDao = App.getInstances().getDaoSession().getGBeanDao();
                for(int i=0;i<bean.getData().getGoodsBrief().size();i++){
                    gBeanDao.insert(new GBean(i+1,bean.getData().getGoodsBrief().get(i).getGoods_name(),bean.getData().getGoodsBrief().get(i).getId()));
                }*/
            }
        });
    }
}
