package com.serigne.common;

/**
 * Utilisation JDBC
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.serigne.customer.dao.CustomerDAO;
import com.serigne.customer.model.Customer;

public class App
{
    public static void main( String[] args )
    {
    	ApplicationContext context =
    		new ClassPathXmlApplicationContext("Spring-Module.xml");

        CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
        Customer customer = new Customer("demba",30);
        customerDAO.insert(customer);

        Customer customer1 = customerDAO.findByCustomerId(1);
        System.out.println("Nom : "+customer1.getName()+", Age : "+customer1.getAge());

    }
}