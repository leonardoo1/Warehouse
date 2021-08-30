package ushtrime;
/**
* Create a class called Order that a warehouse might use to represent an order for a list of
products requested at the warehouse.
* An Order should include the following information as instance variables:
* a part ID (type int)
* a list of ProductQuantity (type List<ProductQuantity>)
* a part description(type String),
* a part total cost (type double),
* a part date (type Date)
* In addition, provide a method named getCost(type List<ProductQuantity>), amount that
calculates the total cost of the order
*/

public class Order {
            
           private int partID;
           private List <ProductQuantity> prodqty;
           private String description;
           private double totcost;
           private Date date;


       public Order(){

       }

       public void getCost(List <ProductQuantity>){
        for(int i=0;i<prodqty.size();i++){
             int cost += totcost * prodqty.get(i);
            }
            System.out.println("Result: "+ prodqty);
       }



      public int getPartID(){
          return partID;
      }

      public void setPartID(int partID){
          this.partID = partID;
      }

      public List getProdqty(){
          return prodqty;
      }

      public void setProdqty(List<ProductQuantity>){
          this.prodqty = prodqty;
      }

      public String getDescription(){
          return description;
      }

      public void setDescription(String description){
           this.description=description;
        }
           
        public double getTotcost(){
            return totcost;
        }

        public void setTotcost(double totcost){
            this.totcost=totcost;
        }

        public Date getDate(){
            return date;
        }

        public void setDate(Date date){
            this.date = date;
        }
}
