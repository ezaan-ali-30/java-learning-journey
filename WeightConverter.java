import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        // WEIGHT CONVERTER PROGRAM

        Scanner sc = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Converter Program");
        System.out.println("Option 1 : Convert lbs to kgs");
        System.out.println("Option 2 : Convert kgs to lbs");

        System.out.print("Choose an option: ");
        choice = sc.nextInt();

        if(choice == 1){
            System.out.println("Enter the weight in lbs: ");
            weight = sc.nextDouble();
            newWeight = weight / 2.205;
            System.out.printf("The new weight in kgs is %.2f" , newWeight);

        }
        else if(choice == 2){
            System.out.println("Enter the weight in kgs: ");
            weight = sc.nextDouble();
            newWeight = weight * 2.205;
            System.out.printf("The new weight in lbs is %.2f" , newWeight);

        }
        else{
            System.out.println("This is not a valid choice");
        }
        sc.close();

    }


}
