package com.neuedu.his.doctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients//代表语序当前节点使用feign的api远程访问其他服务
public class DoctorApplication {
    public static void main(String[] args){
        SpringApplication.run(DoctorApplication.class,args);
    }
}
