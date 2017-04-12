package com.xtu.web;

import com.xtu.DB.UsersRepository;
import com.xtu.DB.entity.UsersEntity;
import com.xtu.constant.Constant;
import com.xtu.tools.OUT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by Ilovezilian on 2017/4/12.
 */
@Controller
public class UsersController {
    @Autowired
    private UsersRepository usersRepository;

    @RequestMapping(method = RequestMethod.GET)
    public UsersEntity users() {
        UsersEntity entity = usersRepository.findOne("2013551830");
        OUT.prt("userEntity", entity);
        return entity;
    }

    @RequestMapping("/{userId}")
    public String users(
            @PathVariable String userId,
            Model model) {
        model.addAttribute("2013551830");
        UsersEntity usersEntity = usersRepository.findOne(userId);

        model.addAttribute(usersEntity);

        int roleId = usersEntity.getRoleId();
        return getRoleType(roleId);
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrationForm() {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegistration(
            @NotNull @Valid UsersEntity usersEntity,
            Errors errors) {
        if (errors.hasErrors()) {
            return "register";
        }
//        // TODO: 2017/4/12  save user profile to db
//        usersRepository.save(usersEntity);

        return "redirect:/" + getRoleType(usersEntity.getRoleId()) + "/info";
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public String showUserProfile(
            @PathVariable String userId,
            Model model) {
        UsersEntity usersEntity = usersRepository.findOne(userId);
        model.addAttribute(usersEntity);

        return getRoleType(usersEntity.getRoleId()) + "/info";
    }

    private String getRoleType(int role_id) {
        String res;
        if (role_id == Constant.ADMIN) {
            res = "admin";
        } else if (role_id == Constant.TEACHER) {
            res = "teacher";
        } else {
            res = "student";
        }
        return res;
    }

}
