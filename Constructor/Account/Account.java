package Constructor.Account;

public class Account {
    
    private int account_id;
    private String name; 
    private double balance; 

    // public Account(){
    //     account_id = 10392309;
    //     name = "Jalal";
    //     balance = 10000.00;

    //     System.out.println("constructor called");
    // }
    
      public Account(int id, String n, double bal){
        account_id = id;
        name = n;
        balance = bal;
    }

    public void show_Account() {

        System.out.println("Id = " + account_id);
        System.out.println("Name = " + name);
        System.out.println("Balance = " + balance);
    }
}
