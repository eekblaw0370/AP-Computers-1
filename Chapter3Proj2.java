
/**
 * Write a description of class Chapter3Proj2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Chapter3Proj2
{
    public static void main(String [] args){
      Scanner reader = new Scanner(System.in);
      double hourlyWage;
      double hours;
      double hoursOver;
      double weeklyPay;
      
      System.out.print("Enter your hourly wage($ per hour).");
      hourlyWage = reader.nextDouble();
      System.out.print("Enter your total regular hours you worked this week.");
      hours = reader.nextDouble();
      System.out.print("Enter your total overtime hours you worked this week.");
      hoursOver = reader.nextDouble();
      
      weeklyPay= (hourlyWage*hours)+(hoursOver*(hourlyWage*1.5));
      System.out.print("Your total weekly pay is $");
      System.out.println(weeklyPay); 
    }  
}
