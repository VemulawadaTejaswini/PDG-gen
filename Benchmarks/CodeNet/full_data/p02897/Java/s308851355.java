import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    double ans;

    if(n % 2 == 0){
      ans = 1 / 2;
    } else {
      ans = ((n / 2) + 1) / n;
    }

    System.out.println(ans);
  }
}
