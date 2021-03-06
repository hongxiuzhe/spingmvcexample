package com.dzhao.springmvc.repositories;

import com.dzhao.springmvc.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by dzhao on 24/08/2015.
 */
public class UserRepositoryTest extends AbstractRepositoryTest{

    @Autowired
    protected UserRepository userRepository;

    @Test
    public void testSave(){

        User kevin = new User();
        kevin.setUserName("Kevin");
        kevin.setPassword("kevin");
        kevin.setEmail("kevin@gmail.com");

        userRepository.save(kevin);
        userRepository.flush();

        User result = userRepository.findOne(kevin.getId());
        Assert.assertNotNull(result);
        Assert.assertEquals(kevin.getId(), result.getId());

    }
}
