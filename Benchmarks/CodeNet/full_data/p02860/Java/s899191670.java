import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();

    if (n%2==0) {
      String s1=s.substring(0,n/2-1);
      String s2=s.substring(n/2,n-1);
      if (s1.equals(s2)) {
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }else{
      System.out.println("No");
    }
  }
}
