import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = Math.pow((int)(n/2), 2);
    System.out.println(n%2 == 0 ? ans : ans+(n/2));
  }
}
