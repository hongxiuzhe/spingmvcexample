package com.dzhao.springmvc.services;

import com.dzhao.springmvc.model.User;
import com.dzhao.springmvc.repositories.UserRepository;
import com.dzhao.springmvc.services.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 *
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    //@Resource
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public User create(@RequestBody @Valid final User user){
        return userService.create(user);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public User update(@RequestBody @Valid final User user){
        return userService.update(user);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public User delete(@PathVariable("id") String id) {
        return userService.delete(id);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public User findById(@PathVariable("id") String id) {
        return userService.findById(id);
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public List<User> findAll() {
        return userService.findAll();
    }
}