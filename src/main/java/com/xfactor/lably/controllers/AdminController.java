package com.xfactor.lably.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


import com.xfactor.lably.entity.Admin;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    ArrayList<Admin> admins = new ArrayList<>();

   
    @GetMapping("/getAdmin")
    public ArrayList<Admin> getAdmin() {
        return admins;
    }

    @PostMapping("/addAdmin")
    public Admin addAdmin(@RequestBody Admin admin) {
/*      String name = admin.getName();
        String username = admin.getUsername();
        String password = admin.getPassword();

        admin.setName(name);
        admin.setUsername(username);
        admin.setPassword(password);
 */
        admins.add(admin);
        return admin;
    }

    @GetMapping("/search")
    public ArrayList<Admin> searchAdmin(@RequestParam String username){

        ArrayList<Admin> ad = new ArrayList<>();
        boolean f = false;

        for(Admin a: admins){
            if(a.getUsername().equals(username)){
                f = true;
                ad.add(a);
            }              
        }
        if(f==true) return ad;
        else return null;
    }

}
