package com.xtu.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by Ilovezilian on 2017/4/12.
 */
public class UsersControllerTest {
    @Test
    public void users() throws Exception {

    }

    @Test
    public void users1() throws Exception {

    }

    @Test
    public void showRegistrationForm() throws Exception {
        UsersController controller = new UsersController();
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(get("/register")).andExpect(view().name("register"));
    }

}