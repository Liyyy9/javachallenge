package MovieDiscount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = scanner.nextInt();
        double price = 7;

        if(age > 0 && age < 5){
            System.out.println("You will get a 60% discount.");
            System.out.println("The ticket will be $" + String.format("%.2f", (price/100)*60));                         // Return price with 2 decimal places. REF: https://stackoverflow.com/questions/2538787/how-to-print-a-float-with-2-decimal-places-in-java
        } else if(age > 60){
            System.out.println("You will get a 55% discount");
            System.out.println("The ticket will be $" + String.format("%.2f", (price/100)*55));
        } else if(age >= 5 && age <= 60){
            System.out.println("The ticket will be 7 Euros");
        } else {
            System.out.println("Invalid age");
        }
    }
}
