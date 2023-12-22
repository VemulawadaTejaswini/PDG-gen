import java.util.Scanner;
class Main{
  public static void main(String[] args) {
  Scanner scan =  new Scanner(System.in);
 long a = scan.nextLong();
 long b = scan.nextLong();
 long c = b-a*2;
 long d = c/4;
   System.out.println(a+d);
  }
}