import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    String s=sc.next();

    char a=s.charAt(k-1);
    int b=(int)a;

    char aafter=(char)(b+32);

    String safter=s.replace(a,aafter);

    System.out.println(safter);

  }
}
