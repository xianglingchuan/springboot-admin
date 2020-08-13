package com.mm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AppTest {

    @Resource
    private BCryptPasswordEncoder passwordEncoder;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void pwd() {
        String test1 = passwordEncoder.encode("admin");
        System.out.println(test1);
        String test2 = passwordEncoder.encode("admin");
        System.out.println(test2);
        System.out.println(passwordEncoder.matches("admin", test1));
        System.out.println(passwordEncoder.matches("admin", test2));
    }
}
