package cn.itcast.spring_boot_test_01.controller;


import cn.itcast.service.HelloWorldService;
import cn.itcast.spring_boot_test_01.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping
@ConfigurationProperties
@SuppressWarnings("all")
public class HelloController {


    //普通集合
    private List<String> city = new ArrayList<String>();

    public List<String> getCity() {
        return city;
    }

    public void setCity(List<String> city) {
        this.city = city;
    }

    //对象集合
    private List<Person> students = new ArrayList<Person>();

    public List<Person> getStudents() {
        return students;
    }

    public void setStudents(List<Person> students) {
        this.students = students;
    }

    @Autowired
    private HelloWorldService helloWorldService;
    @Autowired
    private HttpServletRequest request;
    private HttpServletResponse response;
    @Autowired
    public Environment getEnv(){
        return null;
    }
    @RequestMapping("/hello.do")
    public String test(String gender) {
        helloWorldService.sayHello();
//        Cookie cookie   = new Cookie("a","a");
//        response.addCookie(cookie);
       return "hello world";
    }

    @Scheduled(cron = "* * * * * ?")
    public void sayhello() {
        System.out.println(new Date());
    }

}
