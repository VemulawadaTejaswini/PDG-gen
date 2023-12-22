import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long x = sc.nextLong();
    long count = 0;
    for(long i=a;i<=b;i++){
    System.out.println(b/x-a/x+(a%x==0?1:0));
  }
}