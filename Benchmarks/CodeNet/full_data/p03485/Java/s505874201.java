import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    double d=(a+b)/2;
    System.out.println((int)Math.ceil(d));
  }
}