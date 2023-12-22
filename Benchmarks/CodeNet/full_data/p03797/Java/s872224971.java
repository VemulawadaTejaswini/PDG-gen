import java.util.Scanner;
class Main{
  public static void main(String[] args) {
  Scanner scan =  new Scanner(System.in);
 int a = scan.nextInt();
 int b = scan.nextInt();
 int c = b-a*2;
 int d = c/4;
   System.out.println(a+d);
  }
}