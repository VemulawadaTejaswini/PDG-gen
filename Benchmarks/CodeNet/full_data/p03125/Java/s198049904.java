import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    int X = sc.nextInt();
    System.out.println((B % A == 0)?A+B:B-A);
  }
}