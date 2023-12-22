import java.util.*;

public class sample{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n1 = Integer.parseInt(sc.next());
    int n2 = Integer.parseInt(sc.next());
    String s = sc.next();
    
    char s2 = s.charAt(n2-1);
    String s3 = String.valueOf(s2);

    String s0 = s.replace(s3, s3.toLowerCase());
    System.out.println(s0);

  }
}