import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   int l=kbd.nextInt();
   long x=l*100/3;
   long a=x*x*x;
  double A=a/1000000;
    System.out.printf("%.6f\n",A);
}
}