import java.util.Scanner;

class Main{
 public static void main(String[] args){
  Scanner stdIn = new Scanner(System.in);
   final double pi = 3.141;
   int R = stdIn.nextInt();
   double Enshu = 2 * pi * R;
   
   System.out.println(Enshu);
 }
}