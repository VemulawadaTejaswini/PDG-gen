import java.util.Scanner;

public class Main{
  public static void main(String[] args){
  
  Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int D = sc.nextInt();
  double n;
  
  n = N / (2*D+1);
  System.out.println((int)Math.ceil(n));
  }
}
