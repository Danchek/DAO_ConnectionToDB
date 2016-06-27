package com.den.controller;

import com.den.dao.impl.factory.MySQLDAOFactoryCreateImpl;
import com.den.dao.impl.factory.PostgresDAOFactoryCreateImpl;
import com.den.model.Entity;
import com.den.service.MyService;
import com.den.service.impl.MyServiceImpl;

/**
 * Created by User on 27.06.2016.
 */
public class MyController {

    private MyService service = new MyServiceImpl(new MySQLDAOFactoryCreateImpl());

    public  void init(){
        service.create(new Entity("post1", 123));
        service.update(new Entity());
    }
}
