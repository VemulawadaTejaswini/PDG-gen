import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int an = sc.nextInt();
    System.out.println((an==3|an==5|an==7) ? "YES":"NO");
  }
}