package com.blade.demo.service;

import com.blade.demo.BaseTest;
import com.blade.ioc.annotation.Inject;

import org.junit.Assert;
import org.junit.Test;

public class UserServiceTest extends BaseTest {

    @Inject
    private UserService userService;

    @Test
    public void testSayHello() {
        String hello = userService.sayHello();
        Assert.assertEquals("Hello", hello);
    }

    @Test
    public void testSaveUser() {
        //long uid = userService.saveUser(new User("rose"));
        //Assert.assertEquals(9881, uid);
    }

}
