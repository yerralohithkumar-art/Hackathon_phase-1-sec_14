
import java.util.Scanner;

class BankAccount {
    String accNo;
    String name;
    double balance;

    BankAccount(String no, String n, double initial) {
        accNo = no;
        name = n;
        balance = initial;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn");
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    double checkBalance() {
        return balance;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Holder Name: " + name);
        System.out.println("Balance: " + checkBalance());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String no = sc.nextLine();

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter account balance: ");
        double initial = sc.nextDouble();

        BankAccount b = new BankAccount(no, name, initial);

        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        b.deposit(dep);

        System.out.print("Enter withdrawal amount: ");
        double wd = sc.nextDouble();
        b.withdraw(wd);

        System.out.println("Final account details:");
        b.displayAccount();

        sc.close();
    }
}
