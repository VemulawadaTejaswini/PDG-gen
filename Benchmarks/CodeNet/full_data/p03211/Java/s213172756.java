import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    int min = 2000000000;
    for(int i = 0;i<n-2;i++){
      int a = Integer.parseInt(s.substring(i,i+3));
      min = Math.min(min,Math.abs(753-a));
    }
    System.out.println(min);
  }
}
