package com.yunhe.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String lastName;
    private String email;//邮箱
    private Integer sex;//性别
    private Date birth;//生日

    public Employee(Integer id, String lastName, String email, Integer sex, Date birth) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.sex = sex;
//        默认的创建日期
        this.birth = new Date();
    }
}
