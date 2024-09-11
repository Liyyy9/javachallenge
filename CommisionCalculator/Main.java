package CommisionCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your total sales: ");

        int sales = scanner.nextInt();
        int calculated;
        System.out.println("Your total sales is: $" + sales);

        // Calculate commission
        if(sales <= 1000){
            System.out.println("N/A");
        } else if(sales > 1000 && sales <= 4999){
            System.out.println("Your commission is 10%");
            calculated = (sales/100)*10;
            System.out.println("You will receive: $" + calculated);
        } else if(sales >= 5000 && sales <= 9999){
            System.out.println("Your commission is 20%");
            calculated = (sales/100)*20;
            System.out.println("You will receive: $" + calculated);
        } else if(sales >= 10000 ){
            System.out.println("Your commission is 30%");
            calculated = (sales/100)*30;
            System.out.println("You will receive: $" + calculated);
        }
    }
}
