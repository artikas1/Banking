public class BankAccount {
    double balance;

    public BankAccount() {
        balance = 500;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance+=amount;
        }
        else {
            System.out.println("Try again!");
        }
    }

    public void withdraw(double amount) {
        if( balance < amount) {
            System.out.println("Insufficient funds!");
        }
        else {
            balance-=amount;
        }
    }

    public void transfer(BankAccount targetAccount, double amount) {
        if (amount <= 0) {
            System.out.println("Try again!");
        } else if(balance < amount) {
            System.out.println("Insufficient funds!");
        } else {
            this.balance -= amount;
            targetAccount.balance += amount;
            System.out.println("Transfer was successful!");
        }
    }

    public void printBalance() {
        System.out.println(balance);
    }

}
