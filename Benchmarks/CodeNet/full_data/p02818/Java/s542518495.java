import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    if(a + b < c){
      System.out.println(0 + " " + 0);
      System.exit(0);
    }
    if(a < c){
      c -= a;
      b -= c;
      System.out.println(0 + " " + b);
    }else{
      a -= c;
      System.out.println(a + " " + b);
    }
    
  }
}