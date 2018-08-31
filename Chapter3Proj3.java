
/**
 * Write a description of class Chapter3Proj3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Chapter3Proj3
{
    public static void main(String [] args){
      Scanner reader = new Scanner(System.in);
      double hourlyWage;
      double hoursMon;
      double hoursOverMon;
      double hoursTues;
      double hoursOverTues;
      double hoursWend;
      double hoursOverWend;
      double hoursThurs;
      double hoursOverThurs;
      double hoursFri;
      double hoursOverFri;
      double hoursSat;
      double hoursOverSat;
      double hoursSun;
      double hoursOverSun;
      double weeklyPay1;
      double weeklyPay2;
      double weeklyPay3;
      double weeklyPay4;
      
      System.out.print("Enter your hourly wage($ per hour).");
      hourlyWage = reader.nextDouble();
      
      //Monday
      System.out.print("Enter your total regular hours you worked on Monday.");
      hoursMon = reader.nextDouble();
      System.out.print("Enter your total overtime hours did you work on Monday.");
      hoursOverMon = reader.nextDouble();
      //Tuesay
      System.out.print("Enter your total regular hours you worked on Tuesday.");
      hoursTues = reader.nextDouble();
      System.out.print("Enter your total overtime hours did you work on Tuesday.");
      hoursOverTues = reader.nextDouble();
      //Wednesday
      System.out.print("Enter your total regular hours you worked on Wednesday.");
      hoursWend = reader.nextDouble();
      System.out.print("Enter your total overtime hours did you work on Wednesday.");
      hoursOverWend = reader.nextDouble();
      //Thursday
      System.out.print("Enter your total regular hours you worked on Thursday.");
      hoursThurs = reader.nextDouble();
      System.out.print("Enter your total overtime hours did you work on Thursday.");
      hoursOverThurs = reader.nextDouble();
      //Friday
      System.out.print("Enter your total regular hours you worked on Friday.");
      hoursFri = reader.nextDouble();
      System.out.print("Enter your total overtime hours did you work on Friday.");
      hoursOverFri = reader.nextDouble();
      //Saturday
      System.out.print("Enter your total regular hours you worked on Saturday.");
      hoursSat = reader.nextDouble();
      System.out.print("Enter your total overtime hours did you work on Saturday.");
      hoursOverSat = reader.nextDouble();
      //Sunday
      System.out.print("Enter your total regular hours you worked on Sunday.");
      hoursSun = reader.nextDouble();
      System.out.print("Enter your total overtime hours did you work on Sunday.");
      hoursOverSun = reader.nextDouble();
      
      
      weeklyPay1= (hourlyWage*hoursMon)+(hoursOverMon*(hourlyWage*1.5))+(hourlyWage*hoursTues)+(hoursOverTues*(hourlyWage*1.5));
      weeklyPay2= (hourlyWage*hoursWend)+(hoursOverWend*(hourlyWage*1.5))+(hourlyWage*hoursThurs)+(hoursOverThurs*(hourlyWage*1.5));
      weeklyPay3= (hourlyWage*hoursFri)+(hoursOverFri*(hourlyWage*1.5))+(hourlyWage*hoursSat)+(hoursOverSat*(hourlyWage*1.5));
      weeklyPay4= (hourlyWage*hoursSun)+(hoursOverSun*(hourlyWage*1.5));
      
      
      System.out.print("Your total weekly pay is $");
      System.out.println(weeklyPay1+weeklyPay2+weeklyPay3+weeklyPay4); 

    
    
    }
}

