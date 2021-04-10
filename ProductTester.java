package Inventory;
import java.util.Scanner;

public class ProductTester {
    
    ProductTester(){
        Product p1 = new Product();
        p1.setNumber(1);
        p1.setName("Iphone 12");
        p1.setQty(11);
        p1.setPrice(958.7);
        p1.setInventoryValue(958.7 * 11);
        System.out.println(p1.toString());
         
        Product p2 = new Product();
        p2.setNumber(2);
        p2.setName("Samsung Galaxy S20 Ultra");
        p2.setQty(14);
        p2.setPrice(856);
        p2.setInventoryValue(856 * 14);
        System.out.println(p2.toString());
    }
    
    ProductTester(String parameter){
        Product p3 = new Product();
        p3.setNumber(3);
        p3.setName("Oppo Find X2 Pro");
        p3.setQty(17);
        p3.setPrice(1232.6);
        p3.setInventoryValue(1232.9 * 17);
        System.out.println(p3.toString());
        
        Product p4 = new Product();
        p4.setNumber(4);
        p4.setName("Xiaomi Black Shark 3 Pro");
        p4.setQty(16);
        p4.setPrice(956.8);
        p4.setInventoryValue(956.8 * 16);
        System.out.println(p4.toString());
        
        Product p5 = new Product();
        p5.setNumber(5);
        p5.setName("Asus ROG Phone 5");
        p5.setQty(11);
        p5.setPrice(889.4);
        p5.setInventoryValue(889.4 * 11);
        System.out.println(p5.toString());
        
        Product p6 = new Product();
        p6.setNumber(6);
        p6.setName("Oppo Find X2 Pro");
        p6.setQty(0);
        p6.setPrice(684.2);
        p6.setInventoryValue(684.2 * 0);
        p6.setStatus(false);
        System.out.println(p6.toString2());      
    }
    
    public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.print("|               LIST PHONE PRODUCT              |\n");
        System.out.print("=================================================");
        new ProductTester();
        new ProductTester("parameter");
        System.out.println("==================================================");
        
        Product pro = new Product();
        int tempNumber;
        String tempName;
        int tempQty;
        double tempPrice; 
        int maxSize;
        
        System.out.println("Enter the number of products you would like to add");
        System.out.println("Enter 0 (zero) if you do not wish to add products");
        
        int i = 10;
        while(0 < i){
            System.out.println("==================================================");
            System.out.print("Input number of product : ");
            maxSize = in.nextInt();
            
            if(maxSize == 0){
                System.out.println("Incorrect Value entered");
                System.out.println("No products required!");
                break;
            }
            else{
                //--------
                String[] productBased;
                for(int j = 0; j < maxSize; j++){
                    System.out.print("input code product      : ");
                    tempNumber = in.nextInt();
                    System.out.print("input name product      : ");
                    tempName = in.next();
                    System.out.print("input quantity product  : ");
                    tempQty = in.nextInt();
                    System.out.print("input price product     : ");
                    tempPrice = in.nextDouble();    
                    System.out.println("==================================================");
                    
                    pro.setNumber(tempNumber);
                    pro.setName(tempName);
                    pro.setQty(tempQty);
                    pro.setPrice(tempPrice);
                }  
            }
            break;
        }      
    }             
}
