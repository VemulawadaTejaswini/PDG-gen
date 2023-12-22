import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String c1=sc.next();
    String c2=sc.next();
    char ca[]=new char[3];
    char cb[]=new char[3];
    for (int i=0;i<3;i++) {
      ca[i]=c1.charAt(i);
      cb[i]=c2.charAt(i);
    }

    if (ca[0]==cb[2]&&ca[1]==cb[1]&&ca[2]==cb[0]) {
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
