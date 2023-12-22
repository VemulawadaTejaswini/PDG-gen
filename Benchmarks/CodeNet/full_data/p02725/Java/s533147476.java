import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long k = sc.nextLong();
    int n = sc.nextInt();
    long[] a = new long[n];
    for(int i = 0; i < n; i++){
      long temp = sc.nextLong();
      if(temp > k/2) {
    	  a[i] = k -temp;
      }
      else {
    	  a[i] = temp;
      }
    }
    Arrays.sort(a);
    long ans = 0;
    if(a[n-1] == a[n-2]) {
    	ans = a[n-1]*2;
    }
    else {
    	ans = a[n-1];
    }
    System.out.println(ans);
  }
}