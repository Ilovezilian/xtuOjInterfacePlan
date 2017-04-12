package com.xtu.DB.jdbc;

import com.xtu.DB.entity.UsersEntity;
import com.xtu.tools.OUT;
import org.junit.Test;

/**
 * Created by Ilovezilian on 2017/4/12.
 */
public class UsersRepositoryImpTest {
    @Test
    public void count() throws Exception {
        UsersRepositoryImp usersRepositoryImp = new UsersRepositoryImp();
        UsersEntity entity = usersRepositoryImp.findOne("2013551830");
        OUT.prt("user from db " , entity);

    }

    @Test
    public void findOne() throws Exception {

    }

    @Test
    public void save() throws Exception {

    }

    @Test
    public void delete() throws Exception {

    }

}