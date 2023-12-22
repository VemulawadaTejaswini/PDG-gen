import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int c = sc.nextInt();
    int ans = 0;
    ans = (c-s*2)/4 + s;
    System.out.println(ans);
  }
}