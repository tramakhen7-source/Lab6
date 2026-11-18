package Excercie;
class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Calls base constructor
        this.interestRate = interestRate;
    }

    public void display() {
        System.out.println("Account: " + accountNumber + ", Balance: $" + balance + ", Interest Rate: " + interestRate + "%");
    }
}

public class Main4 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("ACC-987", 1500.0, 4.5);
        sa.display();
    }
}