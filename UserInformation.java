package Entity;

import java.util.Scanner;

public class UserInformation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        switch (name) {
            case "Agate" -> System.out.println(" Welcome! ");
            case "John" -> System.out.println("Access denied. ");
            default -> System.out.println(" Invalid user name. Try again.  ");
        }


        String password = "";

        System.out.println("Please enter your account number. ");

        while (!password.equals("007")) {
            password = scanner.nextLine().trim();
            if (password.equals("007")) {
                break;
            } else {
                System.out.println("Incorrect, please try again");
            }

        }
        System.out.println("Correct! Welcome to your account. ");

        System.out.println("Do you want to see your accounts balance? ");
        String balance = scanner.nextLine();

        switch (balance) {
            case "Yes" -> System.out.println("Your current accounts balance is " + 100.00);
            case "No" -> System.out.println("Thank you! Have a lovely day! ");
            default -> System.out.println("Please chose another option.  ");

        }
        Scanner keyboard= new Scanner(System.in);
        System.out.println("How much money do you want to withdraw?  ");
        float withdraw = keyboard.nextFloat();

        if (withdraw > 100) {
            System.out.println(withdraw + " .");
        } else if (withdraw >= 5 && withdraw <= 100) {
            System.out.println(withdraw + " Thank you for using this bank.Have a nice day!");
        } else if (withdraw < 4 ) {
            System.out.println(withdraw + " You Can withdraw only amount over 4 euros. ");





        }













    }
}


