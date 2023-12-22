import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double n=sc.nextInt();
    if (n%2==0) {
      double b=(n/2)/n;
      System.out.println(b);
    }else{
      double b=((n+1)/2)/n;
      System.out.println(b);
    }
  }
}
