import java.util.Scanner;

public class ATMsimulator {
    double balance;
    public ATMsimulator(double b) {
        balance = b;
    }

    public void checkBalance() {
        System.out.println("Total balance: " + balance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Amount " + amount + " deposited successfully.");
        checkBalance();
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount < 0) {
            throw new IllegalArgumentException("Withdraw amount cannot be negative.");
        }
        if (withdrawAmount > balance) {
            throw new ArithmeticException("Insufficient funds.");
        }
        balance -= withdrawAmount;
        System.out.println("Amount " + withdrawAmount + " withdrawn successfully.");
        checkBalance();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATMsimulator atm = new ATMsimulator(500);

        try {
            while (true) {
                System.out.println("\n=== ATM Menu ===");
                System.out.println("1. Deposit");
                System.out.println("2. Check Balance");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double amount = sc.nextDouble();
                        atm.deposit(amount);
                        break;

                    case 2:
                        atm.checkBalance();
                        break;

                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        atm.withdraw(withdrawAmount);
                        break;

                    case 4:
                        System.out.println("Thank you for using ATM. Goodbye!");
                        return;

                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numbers only.");
        } finally {
            System.out.println("== Transaction Ended ==");
            sc.close();
        }
    }
}

