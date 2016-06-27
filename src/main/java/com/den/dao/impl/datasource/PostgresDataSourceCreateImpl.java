package com.den.dao.impl.datasource;

import com.den.dao.DataSourceCreate;
import com.den.datasource.DataSource;
import com.den.datasource.impl.PostgresDataSourceImpl;
import com.den.model.Entity;

import java.util.List;

/**
 * Created by User on 27.06.2016.
 */
public class PostgresDataSourceCreateImpl implements DataSourceCreate {
    //TODO DataSource -> Connection -> SQL
    private DataSource dc = new PostgresDataSourceImpl();
    @Override
    public void create(Entity entity) {
        System.out.println("PostgresDataSourceCreateImpl - create");
        dc.create(entity);
    }

    @Override
    public void update(Entity entity) {
        System.out.println("PostgresDataSourceCreateImpl - update");
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
