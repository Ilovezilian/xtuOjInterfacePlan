package com.xtu.DB.entity;


import com.sun.istack.internal.NotNull;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.sql.Timestamp;

/**
 * Created by Ilovezilian on 2017/4/12.
 */
public class UsersEntity {
    @Min(0)
    private int userId;
    @Min(0)
    private int roleId;
    @NotNull
    @Size(min = 5, max = 10)
    private String id;
    @NotNull
    @Size(min = 2, max = 20)
    private String name;
    @Size(min = 0, max = 50)
    private String classId;
    @Size(min = 2, max = 20)
    private String nickname;
    @NotNull
    @Size(min = 6, max = 32)
    private String password;
    @Min(0)
    private byte status = 0;
    @Max(50)
    private String email;
    @Size(min = 1, max = 1)
    private String emailOpen = "Y";
    @Size(min = 5, max = 20)
    private String qq;
    @Size(min = 1, max = 1)
    private String qqOpen = "Y";
    @Size(min = 11, max = 11)
    private String phone;
    @Size(min = 1, max = 1)
    private String phoneOpen = "Y";
    private Timestamp lastLoginTime;
    private Timestamp registerTime;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailOpen() {
        return emailOpen;
    }

    public void setEmailOpen(String emailOpen) {
        this.emailOpen = emailOpen;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getQqOpen() {
        return qqOpen;
    }

    public void setQqOpen(String qqOpen) {
        this.qqOpen = qqOpen;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoneOpen() {
        return phoneOpen;
    }

    public void setPhoneOpen(String phoneOpen) {
        this.phoneOpen = phoneOpen;
    }

    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Timestamp getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Timestamp registerTime) {
        this.registerTime = registerTime;
    }


}
