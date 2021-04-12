
package main;


public class Main {

    public static void main(String[] args) {
       machine atm=new machine();
       atm.accountname("Dina");
       atm.makewithdraw(100);
       atm.makedeposit(5000);
       atm.checkingaccount(10000);
       
       System.out.println("Name: "+atm.accountname());
       System.out.println("Your Withdraw Amount:RM "+atm.makewithdraw());
       System.out.println("Your Deposit Amount:RM "+ atm.makedeposit());
       System.out.println("This Is Your Balance:RM "+ atm.checkingaccount());
       atm.fullthrottle();
       
    }
    
}
