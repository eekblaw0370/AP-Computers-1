
/**
 * Write a description of class IncomeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class IncomeCalculator
{
    public static void main(String [] args){
        //Constants
        final double TAX_RATE = 0.20;
        final double STANDARD_DEDUCTION = 100000.0;
        final double DEPENDENT_DEDUCTION = 2000.0;
        
        Scanner reader = new Scanner(System.in);
        
        double grossIncome;
        int numDependents;
        double taxableIncome;
        double incomeTax;
        
        System.out.print("Enter the gross income: ");
        grossIncome = reader.nextDouble();
        System.out.print("Enter the numbe of dependents: ");
        numDependents = reader.nextInt();
        
        taxableIncome = grossIncome - STANDARD_DEDUCTION - 
                        DEPENDENT_DEDUCTION * numDependents;
        incomeTax = taxableIncome * TAX_RATE;
        
        
        System.out.println("The income tax is $" + incomeTax);
    }
}
