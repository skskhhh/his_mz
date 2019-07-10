package com.neuedu.his.common.web;

import com.github.pagehelper.PageInfo;
import com.neuedu.his.common.bean.BaseBean;
import com.neuedu.his.common.dao.BaseDao;
import com.neuedu.his.common.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class  BaseController<T extends BaseBean,S extends BaseService<T,D>,D extends BaseDao<T>> {

    @Autowired
    private S service;

    public  void insert(T t){
        service.insert(t);
    }

    public void insertBatch(List<T> list){
        service.insertBatch(list);
    }

    public void update(T t){
        service.update(t);
    }
    public void delete(T t){
        service.delete(t);
    }
    public  void deleteById(String id){
        service.deleteById(id);
    }
    public T findById(String id){
        return  service.findById(id);
    }
    public T find(T condition){
        return service.find(condition);
    }
    public List<T> findList(T condition){
        return service.findList(condition);
    }
    public List<T> findAll(){
        return service.findAll();
    }

    public PageInfo<T> getPage(T condition,Integer pageNum,Integer pageSize){
        return service.getPage(condition,pageNum,pageSize);
    }
    public  void save(T t){
        service.save(t);
    }

}
