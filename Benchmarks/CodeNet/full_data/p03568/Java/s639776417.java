import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a;
    int b = 1;
    int ans = 1;
    for (int i = 0;i<n;i++){
      a = sc.nextInt();
      ans *= 3;
      if (a%2 == 0){
        b*=2;
      }
    }
    System.out.println(ans-b);
  }
}