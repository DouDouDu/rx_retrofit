package com.bawei.test.model;

import com.bawei.test.bean.MyBean;

import rx.Observer;

/**
 * 1：类的用途
 * 2：@author 张倩
 * 3:@date 2017/11/15 13:57
 */

public interface IModel {
    void getData(Observer<MyBean> observer);
}
