import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int I = N;
    int ans = 0;
    while(true){
      ans += N %10;
      N = N/10;
      if(N == 0){
        break;
      }
    }
    if(I %ans == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
