package com.den.dao.impl.factory;

import com.den.dao.DAOFactoryCreate;
import com.den.dao.DataSourceCreate;
import com.den.dao.impl.datasource.MySQLDataSourceCreateImpl;

/**
 * Created by User on 27.06.2016.
 */
public class MySQLDAOFactoryCreateImpl implements DAOFactoryCreate {
    @Override
    public DataSourceCreate createDataSoutce() {
        return new MySQLDataSourceCreateImpl();
    }
}
