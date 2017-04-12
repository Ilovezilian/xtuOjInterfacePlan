package com.xtu.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by Ilovezilian on 2017/4/12.
 */
public class UserControllerTest {
    @Test
    public void users() throws Exception {
        UsersController controller = new UsersController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/users")).andExpect(view().name("users"));
    }

}