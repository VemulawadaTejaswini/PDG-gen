import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int k = s.length();
    int cnt = 0;
    for(int i = 0;i < k;i++)if(s.charAt(i)=='x')cnt++;
    System.out.println((cnt<=7)?"YES":"NO");
  }
}