import java.util.*;
 
public class Main {
 
	static Main instance = new Main();
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] a = new int[n];
        long[] count = new long[n];
      
        for(int i = 0; i < n ; i++){
          a[i] = sc.nextInt()-1;
          count[a[i]]++;
        }
        
        
        for(int k = 0; k < n ; k++){
          int K = a[k];
          count[K]--;
          long ans = 0;
          for(int j = 0; j < n; j++){
            long tmp = count[j];
            ans += (tmp*(tmp-1))/2;
          }
          System.out.println(ans);
          count[K]++;
        }
      
	}
}