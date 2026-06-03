package Getter_and_Setter.Product;

public class Product {
    
    private int id;
    private String name; 
    private double price;


    Product(int i, String n, double p){
        id = i;
        name = n; 
        price = p;
    }

    // Setter method

    // --> name, price change or same hote pare, but Id same hote parbe na. 

    // public void setId(int i){
    //     if(i<= 0) 
    //         System.out.println("Id cannot be Negative");
    //     else 
    //         id = i;
    // }

    public void setPrice(double p){
        if(p < 0.0)
            System.out.println("Price must be positive");
        else 
            price = p;
    }
    public void setName(String n){
        name = n;
    }

    // Getter Method

    public int getId(){
        return id;
    }
    public double getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }



}
