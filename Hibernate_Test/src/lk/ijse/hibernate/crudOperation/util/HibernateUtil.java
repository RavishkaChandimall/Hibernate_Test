package lk.ijse.hibernate.crudOperation.util;

import lk.ijse.hibernate.crudOperation.entity.Customer;
import lk.ijse.hibernate.crudOperation.entity.Item;
import lk.ijse.hibernate.crudOperation.entity.OrderDetails;
import lk.ijse.hibernate.crudOperation.entity.Orders;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    private static SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        StandardServiceRegistry sReg = new StandardServiceRegistryBuilder().loadProperties("application.properties").build();
        Metadata mData = new MetadataSources(sReg)
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Item.class)
                .addAnnotatedClass(Orders.class)
                .addAnnotatedClass(OrderDetails.class)
                .getMetadataBuilder().build();
        return mData.getSessionFactoryBuilder().build();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
