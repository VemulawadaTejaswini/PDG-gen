import java.util.Scanner;


public class Cycle1 {
 public static void main(String[]args){
  final double PI = 3.141592;
  Scanner stdIn = new Scanner(System.in);

  System.out.println("半径：");
  double r = stdIn.nextDouble();//半径

  System.out.println(2 * PI * r );

 }
}