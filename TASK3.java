import java.util.Scanner;
public class TASK3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAccount acc=new BankAccount(1000);
        ATM atm=new ATM(acc);
        boolean exit=false;
        while(!exit){
            atm.showMenu();
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid! enter correct choice");
            }
            System.out.println();
        }
    }
}
class ATM {
    BankAccount acc;
    public ATM(BankAccount acc){
        this.acc = acc;
    }
    public void showMenu(){
        System.out.println("ATM Menu");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
        System.out.print("Choose an your choice: ");
    }
    public void checkBalance(){
        System.out.println("Current Balance:"+acc.getBalance());
    }
    public void deposit(double amount){
        acc.deposit(amount);
    }
    public void withdraw(double amount){
        acc.withdraw(amount);
    }
}
class BankAccount {
    double balance;
    public BankAccount(double initialbalance){
        this.balance = initialbalance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("Deposit successful");
        }
        else{
            System.out.println("Amount cannot be negative");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance=balance-amount;
            System.out.println("Withdrawn successful");
        } 
        else if(amount>balance){
            System.out.println("Insufficient balance");        
        } 
        else{
            System.out.println("Amount cannot be negative");
        }
    }
}

