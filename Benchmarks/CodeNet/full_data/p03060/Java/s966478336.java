import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int v[] = new int[n];
    int c[] = new int[n];
    int ans = 0;
    for(int i=0;i<n;i++){
      v[i] = sc.nextInt();
    }
    for(int j=0;j<n;j++){
      c[j] = sc.nextInt();
    }
    for(int k=0;k<n;k++){
      if(v[k] - c[k] >= 0){
        ans += v[k] - c[k];
      }
    }
    System.out.println(ans);
  }
}