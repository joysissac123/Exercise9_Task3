public class Main {

    public static void main(String[] args) {

        Account account = new Account(
                "John", 1000, "123456789"
        );

        System.out.println("Account owner: "
                + account.getOwner());

        System.out.println("Initial balance: "
                + account.getBalance());

        try {

            account.transfer(1500);

        } catch (NotEnoughMoneyException e) {

            System.out.println("Custom exception caught!");
            System.out.println(e.getMessage());

        } catch (Exception e) {

            System.out.println("Other exception occurred!");
            System.out.println(e.getMessage());

        } finally {

            System.out.println("Finally block executed.");

            System.out.println("Current account balance: "
                    + account.getBalance());
        }
    }
}