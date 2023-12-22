import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int  k = s.nextInt();
    int arr[] = new int[n];
    for(int i = 0 ; i<n ; i++ ) {
      arr[i] = s.nextInt();
    }
    int dp[] = new int[n];
    dp[0] = 0;
    dp[1] = Math.abs(arr[1]-arr[0]);
    for (int i =2 ; i< n ;i++) {
        int min = Integer.MAX_VALUE;
        for (int j = 1 ; j<=k ;j++) {
            if(i-j<0) {
                break;
            }
            int lo = Math.abs(-arr[i-j]+arr[i])+dp[i-j];
            if(min>lo) {
                min = lo;
            }
        }
        dp[i] = min;
        //System.out.print(dp[i]+" ");
    }
      
 	System.out.println(dp[dp.length-1]);
  }
}