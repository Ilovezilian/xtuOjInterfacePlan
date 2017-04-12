package com.xtu.DB.entity;

import java.sql.Timestamp;

/**
 * Created by Ilovezilian on 2017/4/12.
 */
@Data
public class UsersEntity {
    private int userId;
    private String id;
    private String name;
    private String classId;
    private String nickname;
    private String password;
    private byte status;
    private String email;
    private String emailOpen;
    private String qq;
    private String qqOpen;
    private String phone;
    private String phoneOpen;
    private Timestamp lastLoginTime;
    private Timestamp registerTime;
}
