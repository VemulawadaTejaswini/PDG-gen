import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s,t;
    s=sc.next();
    t=sc.next();
    int a=0;

    for (int i=0;i<3;i++) {
      if (s.charAt(i)==t.charAt(i)) {
        a++;
      }
    }

    System.out.println(a);

  }
}
