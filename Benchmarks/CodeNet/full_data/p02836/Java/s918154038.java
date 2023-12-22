import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int count=0;

    for (int i=0;i<s.length()/2;i++) {
      // System.out.print(s.charAt(i));
      // System.out.println(s.charAt(s.length()-i-1));
      if(s.charAt(i)!=s.charAt(s.length()-i-1)) count++;
    }

    System.out.println(count);
  }
}
