package com.den.datasource.impl;

import com.den.constant.Constant;
import com.den.datasource.DataSource;
import com.den.model.Entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by User on 27.06.2016.
 */
public class MySQLDataSourceImpl implements DataSource {
    private Connection con;
    public MySQLDataSourceImpl() {
            try {
                //Class.forName("com.mysql.jdbc.Driver").newInstance();
                //Class.forName("com.mysql.jdbc.Driver");
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(Constant.MY_URL, Constant.MY_LOGIN, Constant.PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }

    public void create(Entity entity) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO test_table_m (name, price) VALUES (?,?)");
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
