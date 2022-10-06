package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {

    @Override
    public void add(Product product) {
        //We will write only our Hibernate codes here...//With SQL
        System.out.println("Added to the DataBase using Hibernate");
    }
}
