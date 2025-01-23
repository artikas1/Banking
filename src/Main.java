import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        BankAccount targetAccount = new BankAccount();

        Scanner scanner = new Scanner(System.in);

        boolean working = true;

        while(working) {
            System.out.println("Choose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Print balance");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");

            switch(scanner.nextInt()) {
                case 1 -> {
                    double deposit = scanner.nextInt();
                    bankAccount.deposit(deposit);
                }
                case 2 -> {
                    double withdraw = scanner.nextInt();
                    bankAccount.withdraw(withdraw);
                }
                case 3 -> {
                    System.out.print("Balance: ");
                    bankAccount.printBalance();
                }
                case 4 -> {
                    double transfer = scanner.nextInt();
                    bankAccount.transfer(targetAccount, transfer);

                    System.out.print("Current balance: ");
                    bankAccount.printBalance();
                    System.out.print("Target account balance: ");
                    targetAccount.printBalance();
                }
                case 5 -> working = false;
                default -> System.out.println("Invalid input");
            }
        }
        scanner.close();
    }
}
