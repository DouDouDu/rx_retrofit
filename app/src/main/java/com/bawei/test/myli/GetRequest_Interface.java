package com.bawei.test.myli;

import com.bawei.test.bean.MyBean;

import retrofit2.http.GET;
import rx.Observable;

/**
 * 1：类的用途
 * 2：@author 张倩
 * 3:@date 2017/11/15 13:56
 */

public interface GetRequest_Interface {
    @GET("yunifang/mobile/goods/getall?random=91873&encode=68301f6ea0d6adcc0fee63bd21815d69&category_id=10")
    Observable<MyBean> getdata();

}
