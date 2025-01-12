package com.zdx.springthin.controller;

import com.zdx.springthin.beans.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MyController {


    @GetMapping("/thin")
    public Student thin(@RequestParam String name) {

        /*Map<String, Object> res = new HashMap<>();
        if (name.equals("zdx")) {
            res.put("name", "zwm");
            res.put("age", "36");
            return res;
        }

        res.put("name", "normal");
        res.put("age", "18");
        return res;*/
        Student s = new Student("zwm",18);
        return s;
    }

//   /* public static void main(String[] args) {
//        MyController myController = new MyController();
//        System.out.println(myController.thin("zge"));
//    }*/

}
