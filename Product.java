package Inventory;

public class Product {
    
    // instance field declaration
    private int number;
    private String name;
    private int qty;
    private double price;
    private boolean status = true;
    private double inventoryValue;
    
    // default constructor
    Product(){
        
    }
    // creating constructor
    Product(int number, String name, int qty, int price){
        this.number = number;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }
    
    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getInventoryValue() {
        return inventoryValue;
    }

    public void setInventoryValue(double inventoryValue) {
        this.inventoryValue = inventoryValue;
    }
    
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
  
    @Override
    // active status
    public String toString(){
        String viewProduct;
        viewProduct = "\nItem number        : "+getNumber()+
                      "\nName               : "+getName()+
                      "\nQuantity in stock  : "+getQty()+
                      "\nPrice              : "+getPrice()+" USD"+
                      "\nStock Value        : "+String.format("%.2f", getInventoryValue())+
                      "\nProduct Status     : Active ("+isStatus()+")";
        return viewProduct;
    }    
    // discontinued status
    public String toString2(){
        String viewProduct;
        viewProduct = "\nItem number        : "+getNumber()+
                      "\nName               : "+getName()+
                      "\nQuantity in stock  : "+getQty()+
                      "\nPrice              : "+getPrice()+" USD"+
                      "\nStock Value        : "+String.format("%.2f", getInventoryValue())+
                      "\nProduct Status     : Discontinued ("+isStatus()+")";
        return viewProduct;
    }
}
