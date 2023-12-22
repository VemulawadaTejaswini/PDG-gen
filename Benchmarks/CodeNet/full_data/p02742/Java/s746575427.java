import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int ans = w * h / 2;
    System.out.println(h%2 == 0 ? ans : ans + w/2);
  }
}