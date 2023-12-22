import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();

    for (int i=0;i<s.length();i++) {
      int start=(int)s.charAt(i);
      int ans=start+n;
      if (ans<91) {
        System.out.print((char)ans);
      }else{
        System.out.print((char)(ans-26));
      }
    }

    System.out.println();

  }
}
