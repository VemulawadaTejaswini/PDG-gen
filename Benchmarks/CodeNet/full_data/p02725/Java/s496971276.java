import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long k = sc.nextLong();
    long n = sc.nextLong();
    long[] a = new long[n];
    for(int i = 0; i < n; i++){
      a[i] = sc.nextLong();
    }
    Arrays.sort(a);
    long ans = 10000000;
    for(int i = 0; i < n-1; i++){
      int temp = a[n-1] - a[i];
      if(temp < ans){
        ans = temp;
      }
    }
    System.out.println(ans);
  }
}