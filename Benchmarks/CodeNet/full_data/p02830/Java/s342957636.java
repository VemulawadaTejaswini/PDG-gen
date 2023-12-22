import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
    String b=sc.next();
    String ans="";
    int l=a.length();
    for (int i=0;i<l;++i) {
      ans+=a.charAt(i);
      ans+=b.charAt(i);
    }
    System.out.println(ans);
  }
}
