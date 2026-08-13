public class BankAccount {
    

    String accountNumber;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Funds");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.accountNumber = "123456789";
        account.balance = 0;

        account.deposit(5000);

        account.withdraw(2000);

        account.checkBalance();

        account.withdraw(4000);

        account.checkBalance();
    }
}

