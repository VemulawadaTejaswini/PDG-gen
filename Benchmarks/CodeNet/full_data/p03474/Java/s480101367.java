import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    boolean han=true;
    int a=sc.nextInt();
    int b=sc.nextInt();
    char[] s=sc.next().toCharArray();
    for(int i=0;i<a;i++)
      if(s[i]=='-') {
        System.out.println("No");
        han=false;
        if(han==false)break;
      }
    if(han==true)
      if(s[a]!='-') {
        System.out.println("No");
        han=false;
      }
    if(han==true)
      for(int i=a+1;i<a+b+1;i++)
        if(s[i]=='-') {
          System.out.println("No");
          han=false;
          if(han==false)break;
        }
    if(han==true) System.out.println("Yes");
  }
}