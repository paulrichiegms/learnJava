import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    final static int month = 12;
    final static int percentageMultiplier = 100;

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        //Mortgage Calculator::

        int principal;
        double interestRate;
        int period;
        System.out.println("Hello and welcome!");
        Scanner sc = new Scanner(System.in);
        //MortgageCalculator:
        principal = (int) readNumber("Principal Amount", 1000000);
        interestRate = readNumber("Interest Rate", 10);
        period = (int) readNumber("Period", 30);
        System.out.println("Mortgage Amount: " + mortgageCalculator(principal, interestRate, period));

        //FizzBuzz:
        System.out.print("Enter Number for fizzbuzz check: ");
        int fizzBuzzNumber = sc.nextInt();
        System.out.println(fizzBuzz(fizzBuzzNumber));

        //QuitChecker:
        quitChecker();

    }

    public static String mortgageCalculator(int principal, double interestRate, int period) {
        int totalMonths = period * month;
        double monthlyInterest = (interestRate / percentageMultiplier) / month;

        double mortgage = principal *
                (monthlyInterest * Math.pow((1 + monthlyInterest), totalMonths)) /
                (Math.pow((1 + monthlyInterest), totalMonths) - 1);
        return NumberFormat.getCurrencyInstance().format(mortgage);
    }

    public static double readNumber(String prompt, int max) {
        Scanner sc = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt + ": ");
            value = sc.nextDouble();
            if (value <= 0) {
                System.out.println(prompt + " cannot be negative ");
                continue;
            } else if (value > max) {
                System.out.println(prompt + " cannot be greater than " + max);
                continue;
            } else break;
        }
        return value;
    }

    public static String fizzBuzz(int number) {
        String value;
        if (number % 5 == 0) {
            if (number % 3 == 0) {
                value="FizzBuzz";

            } else {
                value="Fizz";
            }
        } else if (number % 3 == 0) {
            value="Buzz";
        } else {
            value=Integer.toString(number);
        }
        return value;
    }

    public static void quitChecker() {
        String input = "";
        Scanner sc = new Scanner(System.in);
        while(!input.equals("quit")) {
            System.out.print("Enter Value for quitChecker: ");
            input=sc.nextLine().toLowerCase();
            System.out.println(input);
        }
    }
}