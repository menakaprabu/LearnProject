package com.example.LearnProject;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean validateUser(String userid, String password) {
        System.out.println(" Valid User method called in LoginService -----------------------------------**********---------");
     return true;
    }

}
