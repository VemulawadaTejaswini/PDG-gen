import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    int[] h = new int[n];

    for(int i=0; i<n; i++){
      h[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(h);
    int[] ans = new int[n-k+1];
    for(int j=0; j<n-k+1; j++){
      ans[j] = h[j+k-1] - h[j];
    }  
    Arrays.sort(ans);
    System.out.println(ans[0]);

  }
}