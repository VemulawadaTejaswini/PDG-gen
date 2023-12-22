import java.util.*;
import java.io.*;
import java.math.*;

public class Main{

  static long[][] memo;

  static long comb(int n, int r){
    if(n<r){
      return 0;
    }
    if(n==r){
      return 1;
    }
    if(r==0){
      return 1;
    }
    if(memo[n-1][r-1]>0){
      return memo[n-1][r-1];
    }
    memo[n-1][r-1] = (comb(n-1,r)+comb(n-1,r-1))%1000000007;
    return memo[n-1][r-1];
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    Integer n = Integer.parseInt(in.readLine());
    Integer[] a = Arrays.stream(in.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
    memo = new long[n+1][n+1];
    long cnt = 0;
    int deplLeft=0, deplRight=0;
    for(int i=0;i<n+1;i++){
      for(int j=i+1;j<n+1;j++){
        if(a[i]==a[j]){
          deplLeft = i;
          deplRight = j;
        }
      }
    }
    for(int i=0;i<n+1;i++){
        System.out.println(comb(n+1,i+1)-comb(deplLeft + (n - deplRight), i));
    }
  }
}
