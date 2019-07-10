package com.neuedu.his.common.bean;

import lombok.Data;

import java.util.Date;

/**
 * 病例实体类
 */

@Data
public class CaseHistory extends BaseBean {
    private String patientName; //病人姓名
    private String gender;//性别
    private Integer age;//年龄
    private Date birthday;//生日
    private String identityCard;//身份证
    private String homeAddress;//地址
    private Date attendTime;//看诊日期

    private Department department; //看诊
    private  Employee employee;
}
