import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n+1];
		for(int i=0; i<n; i++){
			a[i] = scn.nextInt();
		}
      	int sum = 0;
      	int x = n;
      	for(int i=0; i<n; i++){
          sum += Math.abs(a[i]-a[x]);
          x = i;
        }
      	sum += Math.abs(a[n-1]-a[n]);
      	x = n;
      	for(int i=0; i<n; i++){
      	  int ans = sum;
      	  ans += Math.abs(a[x] - a[i+1]) - Math.abs(a[i] - a[x]) - Math.abs(a[i+1] - a[i]);
      	  System.out.println(ans)
      	  x = i;
    	}
	}
}