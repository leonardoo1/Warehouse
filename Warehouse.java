package ushtrime;

/**
* Create a class called Warehouse that a warehouse might use to represent the actual storage
in it
* A warehouse should include the following information as instance variables:
* storage, a map of all the products that the warehouse has (type HashMap<String,
ProductQuantity>). The key is product�s description
* In addition, provide a method named getProductQuantity(String description) that returns
the product that is being searched if there is any in the warehouse. If the product is found
in the warehouse, returns the ProductQuantity
* Provide a method addProductQuantity(Product, Number) that saves input products to the
warehouse storage. This method should take as inputs the Product and the quantity of
product. It should be a void method and should add the product to warehouse storage map*/

import java.util.HashMap;
import java.util.Scanner;

public class Warehouse {

    public HashMap<String, Integer> storage;

    public void getProductQuantity() {
        System.out.println(storage.containsValue());
    }

    public void addProductQuantity(String product, int no) {

        Scanner oop = new Scanner(System.in);

        System.out.println("Enter a prod name : ");
        product = oop.nextLine();

        System.out.println("Enter a prod qty :");
        no = oop.nextInt();

        System.out.println("Prod entered is :" + product + "with a qty of : " + no);

        storage.put(product, no);

    }

}
