package com.example.SpringBootApp.controller;

import com.example.SpringBootApp.profile.SystemProfile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class Controller {
    @RestController
    @RequestMapping("/")
    public class ProfileController {
       private SystemProfile profile;

        public ProfileController(SystemProfile profile) {
            this.profile = profile;
        }

        @GetMapping("profile")
        public String getProfile() {
            return profile.getProfile();
        }
    }
}
