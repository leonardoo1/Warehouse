package ushtrime;

/**
 * Make an application with the above classes for a customer that comes with a
 * list of products that needs to purchase with the following rule set: - At the
 * beginning at least 5 different types of products must be added to the
 * warehouse storage (use the method addProductQuantity() from Warehouse) - Then
 * create a list of products of the customer. - For every product first should
 * be checked if the products are available (use getProductQuantity of Warehouse
 * class) - If a product is unavailable it should log this event with System.out
 * - If the product is available include it in the order - After all the
 * products are added to the order, show all the products added with the
 * description, quantity and cost of the product. This final list should be
 * shown ordered in alphabetical order. - output the order into a text file
 * (order.txt) and save it on the local PC.
 */
public class OrderTest {

    public static void main(String[] args) {
        Warehouse whs = new Warehouse();
        whs.addProductQuantity("Tulla", 5);

        /**
         * create 4 more instances just like the example above
         */

        whs.getProductQuantity();

    }

}
