package com.bawei.test.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 1：类的用途
 * 2：@author 张倩
 * 3:@date 2017/11/15 15:27
 */
@Entity
public class GBean {
    @Id(autoincrement = true)
    long id;

    String title;
    String my_id;
    public String getMy_id() {
        return this.my_id;
    }
    public void setMy_id(String my_id) {
        this.my_id = my_id;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    @Generated(hash = 410096763)
    public GBean(long id, String title, String my_id) {
        this.id = id;
        this.title = title;
        this.my_id = my_id;
    }
    @Generated(hash = 1601336246)
    public GBean() {
    }

    @Override
    public String toString() {
        return "GBean{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", my_id='" + my_id + '\'' +
                '}';
    }
}
