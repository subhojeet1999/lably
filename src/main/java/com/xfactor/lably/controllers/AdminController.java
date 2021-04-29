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

    // @RequestMapping(method = RequestMethod.GET)
 /*   @GetMapping
    public String hello() {
        return "Greetings from XFACTOR!!!";
    }

    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable String name) {
        return "Greetings from " + name + "!!!";
    }

    @GetMapping("/hello2")
    public String helloName2(@RequestParam String name, @RequestParam String age) {
        return "Greetings from hello2 " + name + "!!!" + age;
    }

    @GetMapping("/hello3")
    public Map<String, String> helloName3(@RequestParam String name, @RequestParam String age) {
        Map<String, String> respoMap = new HashMap<>();
        respoMap.put("name", name);
        respoMap.put("age", age);
        return respoMap;
    }

    @GetMapping("/hello4")
    public ArrayList helloName4(@RequestParam String name, @RequestParam String age) {
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(name);
        arrayList.add(age);
        return arrayList;
    }*/

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
