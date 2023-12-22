import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    int cnt = 0;
    for(int i = 0;i < n;i+=2){
      if(s.charAt(i)=='p')cnt--;
    }
    for(int i = 1;i < n;i+=2){
      if(s.charAt(i)=='g')cnt++;
    }
    System.out.println(cnt);
  }
}