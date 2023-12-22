import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int result = 0;
    if(n-k <= 0) {
      result = n*x;
    }else{
      result = (n-k+1)*x + (k-1)*y;
    }
    
    System.out.println(result);
  }
}