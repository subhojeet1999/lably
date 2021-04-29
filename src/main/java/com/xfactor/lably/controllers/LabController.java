package com.xfactor.lably.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


import com.xfactor.lably.entity.Lab;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lab")
public class LabController {

    ArrayList<Lab> labs = new ArrayList<>();

    @GetMapping("/getLab")
    public ArrayList<Lab> getAdmin() {
        return labs;
    }

    @PostMapping("/addLab")
    public Lab addLab(@RequestBody Admin lab) {
/*      String name = admin.getName();
        String username = admin.getUsername();
        String password = admin.getPassword();

        admin.setName(name);
        admin.setUsername(username);
        admin.setPassword(password);
 */
        admins.add(lab);
        return lab;
    }

    @GetMapping("/search")
    public ArrayList<Lab> searchAdmin(@RequestParam String name){

        ArrayList<Lab> ad = new ArrayList<>();
        boolean f = false;

        for(Lab a: labs){
            if(a.getName().equals(name)){
                f = true;
                ad.add(a);
            }              
        }
        if(f==true) return ad;
        else return null;
    }

   /* @PostMapping("/addTests")
    public Tests addLab(@RequestBody Tests tests) {
        String name = lab.getName();
        name = "NAME - " + name + "\n";
        lab.setName(name);
        //labs.add(lab);
        return lab;
    }

    @PostMapping("/addAdmin")
    public Lab addLab(@RequestBody Lab lab) {
        String name = lab.getName();
        name = "Hello " + name + "\n";
        address = "";
       // lab.setName(name);
       // labs.add(lab);
       // return lab;
    }
    @PostMapping("/addCustomer")
    public Lab addLab(@RequestBody Lab lab) {
        String name = lab.getName();
        name = "Hello " + name;
        lab.setName(name);
        labs.add(lab);
        return lab;
    }

    // // http://localhost:8080/test/hello/xfactor
    // @GetMapping("/hello/{name}")
    // @ResponseBody
    // public String index_greetings(@PathVariable String name) {
    // return "Greetings :" + name;
    // }

    // // http://localhost:8080/test/hello2?id=16
    // @GetMapping("/hello2")
    // @ResponseBody
    // public String getFoos(@RequestParam String id) {
    // return "ID: " + id;
    // }

    // @PostMapping("/employees")
    // Employee newEmployee(@RequestBody Employee newEmployee) {
    // return repository.save(newEmployee);
    // }*/

}
