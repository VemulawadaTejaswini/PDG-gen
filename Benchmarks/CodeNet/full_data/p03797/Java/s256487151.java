import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    long s = sc.nextLong();
    long c = sc.nextLong();
    long ans = 0;
    ans = (c-s*2)/4 + s;
    System.out.println(ans);
  }
}