import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] p = new int[n];
    for(int i=0; i<n; i++){
      p[i] = Integer.parseInt(sc.next());
    }

    int ans = 0;
    for(int i=0; i<n-2; i++){
      if((p[i]-p[i+1])*(p[i+2]-p[i+1]) < 0){
        ans++;
      }
    }

    System.out.println(ans);
  }
}