package cn.itcast.springBoot_mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootMybatisApplication.class)
public class SpringBootMybatisApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("hellw");
    }

}

