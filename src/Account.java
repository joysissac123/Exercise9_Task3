public class Account {

    private String owner;
    private int balance;
    private String accountNumber;

    // Constructor
    public Account(String owner, int balance, String accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    // Getter for owner
    public String getOwner() {
        return owner;
    }

    // Setter for owner
    public void setOwner(String owner) {
        this.owner = owner;
    }

    // Getter for balance
    public int getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Method to transfer money
    public void transfer(int amount) throws NotEnoughMoneyException {

        if (amount > balance) {
            throw new NotEnoughMoneyException(
                    "Not enough money in the account!"
            );
        }

        balance = balance - amount;

        System.out.println("Transfer successful!");
    }
}