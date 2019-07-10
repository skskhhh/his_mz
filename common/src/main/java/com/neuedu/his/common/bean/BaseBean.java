package com.neuedu.his.common.bean;

import com.neuedu.his.common.util.CommonIdGenerator;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class BaseBean {
    private String id;
    private Date updateTime;
    private String delFlag;

    /**
     * 在插入之前的准备工作
     */
    public void preInsert(){
        //1、生成//2、给updateTime赋值
        this.id= CommonIdGenerator.gen();
        //2
        this.updateTime=new Date();
    }

    /**
     * 在更新之前的准备工作
     */
    public void preUpdate(){
        //1、给updateTime赋值
        this.updateTime=new Date();

    }



}
