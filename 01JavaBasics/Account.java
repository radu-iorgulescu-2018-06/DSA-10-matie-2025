import java.security.PublicKey;

package 01JavaBasics;

public class Account {
    // instance variables (non-static fields)
    private String name; // String is not a primitive at 01JavaBasics
    private double balance;

    //Class variables(static fields)
    private static int totalAccounts=0;

    //Constructor with parameters
    public Account(String name, double balance) {
        this.name =  name ;//this variabla de instanta din clasa 
        this.balance = balance;
        totalAccounts++ ;
    }

    //Method: deposit
    public void deposit(double amount){
        this.name = name;
        //this.balance=this.balance + amount;
        System.out.println(x:"Depozit efectuat cu success");
    }
    

    //Method: withdraw
    public void withdraw(double amount) {
        if (this.balance> amount) {
            balance -= amount;
            System.out.println(x:"Ati retras cu success");
        } else {
            System.out.println(x: "Fonduri insuficiente");
        }
    }

    public void displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Balanta: " + balance);
        System.out.println("Numar de conturi: " + totalAccounts);               
    }

     public static void main(Stringp[] args) {
        Account account1 = new Account(name: "Costel", blance:2555);
        account1.displayInfo();

        Account account2 = new Account(name: "Mirel", balance: 3333);
        account2.displayInfo();

        Account account3 = new Account( "Maria", balance: 2222);
        account2.displayInfo();
        
        account1.deposit(amount:1555);
        account1.displayInfo();

     }

}
