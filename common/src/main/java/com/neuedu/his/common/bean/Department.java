package com.neuedu.his.common.bean;

import lombok.Data;

import java.util.List;
@Data
public class Department extends BaseBean{

    private String deparName;
    private String deparType;
    private String departLevel;
    private String pid;

    //子部门集合
    private List<Department> children;
}
