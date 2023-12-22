import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] ans = new int[m+1];
    for(int i=1; i<n+1; i++) {
      int k = sc.nextInt();
      for(int j=0; j<k; j++) {
        ans[sc.nextInt()] += 1;
      }
    }
    int cnt = 0;
    for(int i : ans) {
      if(n == i) cnt++;
    }
    System.out.println(cnt);
  }
}
