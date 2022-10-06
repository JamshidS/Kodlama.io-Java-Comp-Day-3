package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;


public class JdbcProductDao implements ProductDao{
    //We will write only our JDBC codes here...//With SQL
    public void add(Product product){
        System.out.println("Added to the DataBase using JDBC");
    }

}
