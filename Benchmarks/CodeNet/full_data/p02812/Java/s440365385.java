import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int cnt = 0;
    for(int i=3;i<=s.length();i++)
      if(s.substring(i-3,i).equals("ABC"))cnt++;
    System.out.println(cnt);
  }
}
