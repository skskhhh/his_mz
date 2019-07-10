package com.neuedu.his.common.bean;

import lombok.Data;

@Data
public class Employee  extends BaseBean{

    private String employeeName;
    private String phone;
    private String gender;
    private Integer age;
    private String employeeType;
}
