import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int ans = 0;
    for(int i = 16;i >= 0;i--){
      if(K >= Math.pow(2, i)){
        ans++;
        K -= Math.pow(2, i);
      }
      if(K == 0){
        break;
      }
    }
    System.out.println(ans);
  }
}