package com.den.dao;

import com.den.model.Entity;

import java.util.List;

/**
 * Created by User on 27.06.2016.
 */
public interface DataSourceCreate {
    void create(Entity entity);
    void update(Entity entity);
    void delete(int id);
    Entity findOne (int id);
    List<Entity> findAll ();
}
