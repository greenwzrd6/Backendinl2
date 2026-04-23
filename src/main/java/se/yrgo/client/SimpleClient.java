package se.yrgo.client;

import java.util.*;

import org.springframework.context.support.*;
import se.yrgo.domain.*;
import se.yrgo.services.customers.*;

public class SimpleClient {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application.xml")) {
            CustomerManagementService service = container.getBean(CustomerManagementService.class);

            List<Customer> customers = service.getAllCustomers();
            customers.forEach(System.out::println);
        }

    }
}