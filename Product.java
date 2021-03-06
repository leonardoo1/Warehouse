package ushtrime;

/**
 * Create a class called Product that a warehouse might use to represent a
 * product that a customer may need. A Product should include the following
 * information: a part description(type String), a part type of product (type
 * String), a part price (type double), a part year of production (type int), a
 * part capacity of the product (typeString), a part processing (type String)
 * Provide a constructor will all instance variables and getter & setter methods
 */
public class Product {

    private String description;
    private String partType;
    private double price;
    private int yearprod;
    private String partCap;
    private String partProc;

    public Product(String description, String partType, double price, int yearprod, String partCap, String partProc) {
        this.description = description;
        this.partType = partType;
        this.price = price;
        this.yearprod = yearprod;
        this.partCap = partCap;
        this.partProc = partProc;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPartType() {
        return partType;
    }

    public void setPartType(String partType) {
        this.partType = partType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearprod() {
        return yearprod;
    }

    public void setYearprod(int yearprod) {
        this.yearprod = yearprod;
    }

    public String getPartCap() {
        return partCap;
    }

    public void setPartCap(String partCap) {
        this.partCap = partCap;
    }

    public String getPartProc() {
        return partProc;
    }

    public void setPartProc(String partProc) {
        this.partProc = partProc;
    }
}
