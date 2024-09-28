import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Mortgage Calculator::
        final int month=12;
        final int percentageMultiplier=100;
        int principal;
        double interestRate;
        int period;
        System.out.println("Hello and welcome!");

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Principal Amount: ");
             principal= sc.nextInt();
            if(principal <= 0){
                System.out.println("Principal Amount cannot be negative");
                continue;
            }
            else if(principal > 100000){
                System.out.println("Principal cannot be greater than 100000");
                continue;
            }
            else break;
        }

        while(true){
            System.out.print("Interest Rate: ");
            interestRate= sc.nextDouble();
            if(interestRate <= 0){
                System.out.println("Interest Rate cannot be negative");
                continue;
            }
            else if(interestRate > 20){
                System.out.println("Interest Rate cannot be greater than 20");
                continue;
            }
            else break;
        }

        while(true){
            System.out.print("Period: ");
            period= sc.nextInt();
            if(period <= 0){
                System.out.println("Period cannot be negative");
                continue;
            }
            else if(period > 20){
                System.out.println("Period cannot be greater than 30");
                continue;
            }
            else break;
        }


        int totalMonths = period*month;
        double monthlyInterest =(interestRate/percentageMultiplier)/month;

        double mortgage= principal *
                (monthlyInterest *Math.pow((1+ monthlyInterest),totalMonths))/
                (Math.pow((1+ monthlyInterest),totalMonths)-1);

        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Total Mortgage :"+ formattedMortgage);

        //Fizbuzz::
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Number: ");
//        int number = sc.nextInt();
//        if (number % 5 == 0) {
//            if (number % 3 == 0) {
//                System.out.println("FizzBuzz");
//            }
//            else{
//                System.out.println("Fizz");
//            }
//        }
//        else if (number % 3 == 0) {
//            System.out.println("Buzz");
//        }
//        else{
//            System.out.println(number);
//        }

        //While loop string equal check
//        Scanner sc = new Scanner(System.in);
//        String input = "";
//        while(!input.equals("quit")) {
//            System.out.print("Enter Value: ");
//            input = sc.nextLine().toLowerCase();
//            System.out.println(input);
//        }



    }
}