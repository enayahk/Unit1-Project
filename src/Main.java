
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your total bill in dollars: $");
        double billStart = (scan.nextDouble()*100.0);
        System.out.println("How much of a tip do you want to pay?(percent):");
        double tipPercent = (scan.nextDouble()/100);
        System.out.println("How many people are paying?");
        int people = scan.nextInt();
        System.out.println("---------------");
        System.out.println(" ");
        double tipAmount = ((tipPercent * (billStart/100)));
        System.out.println(" ");
        System.out.printf("Tip amount: $"+ "%.2f",(tipAmount));
        System.out.println(" ");
        System.out.printf("Total bill: $"+ "%.2f", (((billStart)/100) + tipAmount));
        System.out.println(" ");
        System.out.printf("Tip paid per person: $" +"%.2f", +(tipAmount / people));
        System.out.println(" ");
        System.out.printf("Total bill paid per person: $" + "%.2f", +(((tipAmount + (billStart/100)))/people));
        System.out.println(" ");
        System.out.println("---------------");







    }
}