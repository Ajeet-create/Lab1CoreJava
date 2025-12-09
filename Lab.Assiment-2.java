
/*
Q1-

*Assignment-2. Write a Java program that allows the user to create a bank account and
perform transactions such as deposit, withdrawal, and balance inquiry. Using a
conditional operator (ternary operator ), display the message whether minimum balance
is maintained or not.
Steps:
● Create a class BankAccount
● Add three member variables: String accountHolderName , int accountNumber and int balance;
● Add a constructors using all three members
● Add getters and setters.
● Add method deposit (int), withdraw(int)
● Implement the methods by increasing or decreasing the balance
● In the main method create a bank account
● Withdraw money from this account and/or deposit into this account 
● Get the balance
● Create a string variable “status” inside the main method
● Assign values to status as “Minimum Balance Maintained” if balance is above or
equal to 5000. Otherwise values of status will be “Minimum Balance not
Maintained”. Use conditional operator (ternary operator ) to assign the values of
the status.

Ans-
Example
*/

public class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private int balance;

    // Constructor
    public BankAccount(String accountHolderName, int accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters and setters
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public static void main(String[] args) {
        // Create BankAccount object
        BankAccount account = new BankAccount("John Doe", 123456, 6000);

        // Perform transactions
        account.withdraw(1500);  // Withdraw
        account.deposit(2000);   // Deposit

        // Get the current balance
        int currentBalance = account.getBalance();
k
        // Use the ternary operator to determine the status
        String status = (currentBalance >= 5000) ? "Minimum Balance Maintained" : "Minimum Balance not Maintained";

        // Print the status
        System.out.println("Status: " + status);
    }
}

/*output
1500 withdrawn. New balance: 4500
2000 deposited. New balance: 6500
Status: Minimum Balance Maintained
*/
