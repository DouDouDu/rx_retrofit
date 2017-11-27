package com.bawei.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.anye.greendao.gen.GBeanDao;
import com.bawei.test.bean.GBean;
import com.bawei.test.bean.MyBean;
import com.bawei.test.present.MyPresent;
import com.bawei.test.view.Iview;

import java.util.List;

public class MainActivity extends AppCompatActivity implements Iview{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyPresent myPresent = new MyPresent(this);
        myPresent.show();

    }

    @Override
    public void giveData(final MyBean bean) {
        Toast.makeText(MainActivity.this,bean.getData().get(0).getGoods_name(),Toast.LENGTH_SHORT).show();
       /* //查询greendao
        GBeanDao gBeanDao = App.getInstances().getDaoSession().getGBeanDao();
        List<GBean> gBeen = gBeanDao.loadAll();
        for (GBean b : gBeen) {
            Log.i("xx",b.getTitle().toString());
        }*/
    }
}
