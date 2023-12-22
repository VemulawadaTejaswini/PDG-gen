import java.util.Scanner;
public class Circumference{
 public satic void main(String[]args){
 float R;
   double circum;
 Scanner scan = new Scanner(System.in);
 System.out.println("Enter radius of the circle :");
 R = scan.nextFloat();
 circum = 2 * 3.14 * R;
System.out.println("\n Circumference of circle = " + circum);
 }
}