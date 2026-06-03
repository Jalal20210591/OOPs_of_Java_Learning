package Constructor.Account;

public class UseAccount {
    public static void main(String[] args) {
        
        System.out.println();
        
        Account obj = new Account(101, "Anis", 5555.55);
        Account obj2 = new Account(102, "Jalal", 10000.40);

        obj.show_Account();
        System.out.println();

        obj2.show_Account();

    }
}
