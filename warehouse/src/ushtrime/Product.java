package ushtrime;
/**
* Create a class called Product that a warehouse might use to represent a product that a
customer may need.
* A Product should include the following information:
* a part description(type String),
* a part type of product (type String),
* a part price (type double),
* a part year of production (type int),
* a part capacity of the product (typeString),
* a part processing (type String)
* Provide a constructor will all instance variables and getter & setter methods */
public class Product {

    private String description;
    private String partType;
    private double price;
    private int yearprod;
    private String partCap;
    private String partProc;
     
    public Product (description , partType , price , yearprod , partCap, partProc){
        description = this.description;
        partType = this.partType;
        price = this.price;
        yearprod = this.yearprod;
        partCap = this.partCap;
        partProc = this.partProc;
    }


}
