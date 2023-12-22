import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    boolean ans=false;

    for (int i=0;i<s.length();i++) {
      if (i%2==0) {
        if (s.charAt(i)=='R'||s.charAt(i)=='U'||s.charAt(i)=='D') {
          ans=true;
        }else{
          ans=false;
          break;
        }
      }else{
        if (s.charAt(i)=='L'||s.charAt(i)=='U'||s.charAt(i)=='D') {
          ans=true;
        }else{
          ans=false;
          break;
        }
      }
    }

    if (ans==true) {
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

  }
}
