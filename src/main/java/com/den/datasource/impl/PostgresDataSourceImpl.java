package com.den.datasource.impl;

import com.den.constant.Constant;
import com.den.datasource.DataSource;
import com.den.model.Entity;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by User on 27.06.2016.
 */
public class PostgresDataSourceImpl implements DataSource{
    private Connection con;
    public PostgresDataSourceImpl() {
        try {
            // Class.forName("org.postgresql.Driver");
            DriverManager.registerDriver(new org.postgresql.Driver());
            con = DriverManager.getConnection(Constant.POST_URL, Constant.POST_LOGIN, Constant.PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

//        try(Connection con = DriverManager.getConnection(Constant.POST_URL, Constant.POST_LOGIN, Constant.PASSWORD);
//                Connection con2 = DriverManager.getConnection(Constant.POST_URL, Constant.POST_LOGIN, Constant.PASSWORD)){
//            Entity entity = new Entity();
//            PreparedStatement ps = con.prepareStatement("INSERT INTO test_table_m (name, price) VALUES (?,?)");
//            ps.setString(1, entity.getName());
//            ps.setDouble(2, entity.getPrice());
//            ps.execute();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public void create(Entity entity) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO test_table_p (name, price) VALUES (?,?)");
            ps.setString(1, entity.getName());
            ps.setDouble(2, entity.getPrice());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Entity entity) {

    }

    public void delete(int id) {

    }

    public Entity findOne(int id) {
        return null;
    }

    public List<Entity> findAll() {
        return null;
    }
}
