import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your total bill in dollars: $");
        double billStart = (scan.nextDouble()*100);
        System.out.println("How much of a tip do you want to pay?(percent):");
        double tipPercent = (scan.nextDouble()/100);
        System.out.println("How many people are paying?");
        int people = scan.nextInt();
        double tipAmount = ((tipPercent * (billStart/100)));
        System.out.println("Tip amount: $"+(tipAmount));
        System.out.println("Total bill: $"+(((billStart)/100) + tipAmount));
        System.out.println("Tip paid per person: $" +(tipAmount/people));
        System.out.println("Total bill paid per person: $" +(((tipAmount + billStart)/100)/people));






    }
}