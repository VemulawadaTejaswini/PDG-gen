import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    boolean ans=false;

    for (int i=0;i<s.length()/2;i++) {
      if (s.charAt(2*i)=='R'||s.charAt(2*i)=='U'||s.charAt(2*i)=='D'
      &&s.charAt(2*i+1)=='L'||s.charAt(2*i+1)=='U'||s.charAt(2*i+1)=='D') {
        ans=true;
      }else{
        ans=false;
        break;
      }
    }

    if (ans==true) {
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
