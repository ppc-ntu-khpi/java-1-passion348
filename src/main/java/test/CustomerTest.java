package test;

import domain.Customer;

public class CustomerTest {
    public static void main(String[] args) {
        System.out.println("=== Customer Class Demo ===\n");

        System.out.println("Creating customer with default values:");
        Customer customer1 = new Customer();
        customer1.displayCustomerInfo();

        System.out.println("\n--- Using setter methods ---\n");

        customer1.setID(42);
        customer1.setStatus(false);
        customer1.setTotal(5500.75);

        System.out.println("Customer after modifications:");
        customer1.displayCustomerInfo();

        System.out.println("\n=== Program completed successfully ===");
    }
}
