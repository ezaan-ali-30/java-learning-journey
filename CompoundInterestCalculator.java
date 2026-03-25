import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // COMPOUND INTEREST CALCULATOR

        Scanner sc = new Scanner(System.in);

        double principle;
        double rate;
        int time;
        double amount;

        System.out.println("Enter the principle: ");
        principle = sc.nextDouble();

        System.out.println("Enter the rate: ");
        rate = sc.nextDouble();

        System.out.println("Enter the time: ");
        time = sc.nextInt();

        amount = principle * Math.pow(1 + rate/100 , time);

        System.out.printf("The amount for %d year is $%.1f " , time , amount);


        sc.close();



    }
}
