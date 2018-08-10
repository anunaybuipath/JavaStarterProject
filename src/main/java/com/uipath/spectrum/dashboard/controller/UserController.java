package com.uipath.spectrum.dashboard.controller;

import com.uipath.spectrum.dashboard.model.DashboardUser;
import com.uipath.spectrum.dashboard.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userService;

    @GetMapping(path = "/user")
    public DashboardUser helloWorld() {
        logger.info("This is info log");
        DashboardUser user = new DashboardUser();
        user.setName("Dummy User");
        user.setId(2);
        return user;
    }
    @GetMapping(path="/user/{userId}")
    public DashboardUser getUser(@PathVariable Integer userId) {
        return userService.getUser(userId);
    }
}
