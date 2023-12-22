import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int ans = h*w;
    System.out.println(ans%2 == 0 ? ans/2 : ans/2+1);
  }
}