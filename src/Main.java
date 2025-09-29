
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your total bill in dollars: $");
        double billStart = (scan.nextDouble()*100.0);
        System.out.println("How much of a tip do you want to pay?(percent):");
        double tipPercent = (scan.nextDouble()/100);
//          Lines 9-11: saving the initial bill and tip into variables. billStart is multiplied by 100 here to be easier to work with.
//          Since the tip is being entered as a whole number for a percent, it's divided by 100 here to be used as a decimal.
        System.out.println("How many people are paying?");
        int people = scan.nextInt();
//        Amount of people is saved as an int, not a double, because babies aren't paying restaurant bills.
        System.out.print("---------------");
        System.out.println(" ");
        double tipAmount = ((tipPercent * (billStart/100)));
//          Saving the total tip in a separate variable, so it's easier to divide by the number of people later on.
        System.out.printf("Tip amount: $"+ "%.2f",(tipAmount));
        System.out.println(" ");
        System.out.printf("Total bill: $"+ "%.2f", (((billStart)/100) + tipAmount));
        System.out.println(" ");
        System.out.printf("Tip paid per person: $" +"%.2f", +(tipAmount / people));
        System.out.println(" ");
        System.out.printf("Total bill paid per person: $" + "%.2f", +(((tipAmount + (billStart/100)))/people));
//        Lines 20 through 26: Instead of using print.ln to print the final statements, using printf and "%.2f" allows for the
//        final value, no matter what, to be rounded to 2 decimals. Math.round offered a similar effect for the whole
//        numbers present in decimals, but using printf allowed, say, 20.0 to be printed as 20.00.

//        For the printf statements, I also chose to just do the operation within the statement instead of declaring
//        each final value in a separate variable since they're only being calculated once, at the end.
        System.out.println(" ");
        System.out.println("---------------");







    }
}