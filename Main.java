import Controler.Bank;
import Entity.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        switch (name) {
            case "Agate" -> System.out.println(" Welcome!");
            case "John" -> System.out.println("Access denied. ");
            default -> System.out.println(" Invalid user name. Try again.  ");
        }
        String password = "";

        System.out.println("Please enter your password. ");

        while (!password.equals("007")) {
            password = scanner.nextLine().trim();
            if (password.equals("007")) {
                break;
            } else {
                System.out.println("Incorrect, please try again");
            }
            System.out.println("Correct! Welcome to your account. ");


        }

        System.out.println("Do you want to see your accounts balance? ");
        String balance = scanner.nextLine();

        switch (balance) {
            case "Yes" -> System.out.println("Your current accounts balance is " + 100.00);
            case "No" -> System.out.println("Thank you! Have a lovely day! ");
            default -> System.out.println(" Please choose another option.  ");

        }


        User user = new User("12345678 ", 100.00, "Agate", "female");

        Bank bank = new Bank();
        bank.setActiveUser(user);

        System.out.println("Welcome to the bank " + user.name);
        System.out.print("Current balance  " + bank.getUserBalance());

        String response = bank.creditUser(200.50);
        System.out.println(response);
        System.out.println(bank.creditUser(23.25));
        System.out.println(bank.creditUser(50.24));
        System.out.println(bank.creditUser(765.20));

        System.out.print("Current balance" + bank.getUserBalance());
        {


        }
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How much money do you want to withdraw?  ");
        float withdraw = keyboard.nextFloat();

        if (withdraw > 100) {
            System.out.println(withdraw + " .");
        } else if (withdraw >= 5 && withdraw <= 100) {
            System.out.println(withdraw + " Thank you for using this bank.Have a nice day!");
        } else if (withdraw < 4) {
            System.out.println(withdraw + " You Can withdraw only amount over 4 euros. ");


        }


    }
}
