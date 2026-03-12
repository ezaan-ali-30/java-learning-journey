import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double length = 0;
        double breadth = 0;
        double area = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER LENGTH: ");
        length = sc.nextDouble();

        System.out.print("ENTER BREADTH: ");
        breadth = sc.nextDouble();

        area = length * breadth;
        System.out.println("THE AREA IS: " + area + "cm^2");

        sc.close();



    }
}

