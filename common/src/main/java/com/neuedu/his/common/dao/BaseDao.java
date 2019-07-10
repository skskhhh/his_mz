package com.neuedu.his.common.dao;

import com.neuedu.his.common.bean.BaseBean;
import java.util.List;
public interface BaseDao<T extends BaseBean>{
    void insert(T t);

    void insertBatch(List<T> list);//批量插入数据

    void update(T t);

    void delete(T condition); //condition作为删除的条件对象

    void deleteById(String id);//根据id删除数据

    T findById(String id);//根据Id查询

    T find(T condition); //根据条件对象来查询

    List<T> findList(T condition);//根据条件出啊讯对象集合

    List<T> findAll();//查询所有





}
