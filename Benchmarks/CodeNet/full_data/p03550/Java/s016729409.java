import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long z = sc.nextLong();
    long w = sc.nextLong();
    long[] a = new long[n];
    for(int i=0;i<n;i++)a[i]=sc.nextLong();
    if(n==1)System.out.println(Math.abs(a[0]-w));
    else System.out.println(Math.max(Math.abs(a[n-1]-w),Math.abs(a[n-1]-a[n-2])));
  }
}