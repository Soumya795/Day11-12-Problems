package dailyproblems;

import java.util.Scanner;

public class Account {

    public static void main(String[] args) {
        Account obj = new Account();
        obj.debit();
    }

    void debit() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the available balance in your in account ");
        int accountBalance = s.nextInt();
        System.out.println("Enter The Amount You Want To Debit");
        int amount = s.nextInt();
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Your account is debited by RS " + amount);
            System.out.println("Available Balance is RS " + accountBalance);
        } else {
            System.out.println("Debit amount exceeded account Balance and Available Balance is RS" + accountBalance);
        }

    }

}
