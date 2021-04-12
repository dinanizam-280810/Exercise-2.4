
package main;


public class machine {
    String name;
    int withdraw;
    double deposit;
    double check;
    
    //create setter method
    public void accountname(String name){
        this.name=name;
    }
    public void makewithdraw(int withdraw){
        this.withdraw=withdraw;
    }
    public void makedeposit(double deposit){
        this.deposit=deposit;
        
    }
    public void checkingaccount(double check){
        this.check=check;
    }
    
    //create getter method
    public String accountname(){
        return this.name;
    }
    public Integer makewithdraw(){
        return this.withdraw;
       
    }
    public double makedeposit(){
        return this.deposit;
    }
    public double checkingaccount(){
        return this.check;
    }
    //create a fullthrottle() method
    public void fullthrottle(){
        System.out.println("\nThank You And Enjoy your money");
    }
}
