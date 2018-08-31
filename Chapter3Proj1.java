
/**
 * Write a description of class Chapter3Proj1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Chapter3Proj1
{
    public static void main(String [] args){
      Scanner reader = new Scanner(System.in);
      int length;
      int surfaceArea;
      
      System.out.print("Enter the length of one edge of the cube");
      length = reader.nextInt();
      
      surfaceArea= (length*length)*6;
      System.out.print("The Surface Area is");
      
      System.out.println(surfaceArea); 
          
   }
}
