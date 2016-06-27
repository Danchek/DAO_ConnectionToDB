package com.den.service.impl;

import com.den.dao.DAOFactoryCreate;
import com.den.dao.DataSourceCreate;
import com.den.model.Entity;
import com.den.service.MyService;

import java.util.List;

/**
 * Created by User on 27.06.2016.
 */
public class MyServiceImpl implements MyService {

    private DataSourceCreate dataSourceCreate;

    public MyServiceImpl(DAOFactoryCreate dao) {
        //Инверсия управления (IOC/DI)
        dataSourceCreate = dao.createDataSoutce();
    }

    @Override
    public void create(Entity entity) {
        dataSourceCreate.create(entity);
    }

    @Override
    public void update(Entity entity) {
        dataSourceCreate.update(entity);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Entity findOne(int id) {
        return null;
    }

    @Override
    public List<Entity> findAll() {
        return null;
    }
}
