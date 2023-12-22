import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    
    int n = N;
    int sum = 0;
    while(n > 0){
      sum += n%10;
      n /= 10;
    }
    System.out.println(N%sum == 0 ? "Yes" : "No");
  }
}