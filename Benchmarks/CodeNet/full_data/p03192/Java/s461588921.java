import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int cnt =0;
    for(int i =0 ;i < 4;i++)if(s.charAt(i)=='2')cnt++;
    System.out.println(cnt);
  }
}