package Getter_and_Setter.Product;

public class Use_Product {
    
    public static void main(String[] args) {
        
        System.out.println();

        Product p1 = new Product(101, "Battery", 45.00);
        
        // Product p1 = new Product();
        // p1.setId(101);
        // p1.setName("Battery");
        // p1.setPrice(45.00);

        p1.setName("Electric Battery");
        p1.setPrice(50.0);
        
        System.out.println("Product Id = " + p1.getId());
        System.out.println("Product Name = " + p1.getName());
        System.out.println("Product Price = "+ p1.getPrice());

    }

}
