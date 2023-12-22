import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int q = sc.nextInt();
    long[] s = new long[a];
    long[] t = new long[b];
    long[] x = new long[q];
    for(int i = 0; i < a; i++){
      s[i] = sc.nextLong();
    }
    for(int i = 0; i < b; i++){
      t[i] = sc.nextLong();
    }
    for(int i = 0; i < q; i++){
      x[i] = sc.nextLong();
    }
    for(int i = 0; i < q; i++){
      System.out.println(solve(s, t, x[i]));
    }
  }
  
  public static long solve(long[] a, long[] b, long x){
    long sum1 = 0;
    int i = binarySearch(a, x);
    int ti;
    
    long tmp1 = 0;
    tmp1 += Math.abs(x - a[i]);
    ti = binarySearch(b, a[i]);
    tmp1 += Math.abs(a[i] - b[ti]);

    long tmp2 = Long.MAX_VALUE;
    if(i-1 > 0){
      tmp2 = Math.abs(x - a[i-1]);
      ti = binarySearch(b, a[i-1]);
      tmp2 += Math.abs(a[i-1] - b[ti]);
    }
    sum1 = Math.min(tmp1, tmp2);
    
    long sum2 = 0;
    i = binarySearch(b, x);
    tmp1 = 0;
    tmp1 += Math.abs(x - b[i]);
    ti = binarySearch(a, b[i]);
    tmp1 += Math.abs(a[ti] - b[i]);

    tmp2 = Long.MAX_VALUE;
    if(i - 1 > 0){
      tmp2 = Math.abs(x - b[i-1]);
      ti = binarySearch(a, b[i-1]);
      tmp2 += Math.abs(a[ti] - b[i-1]);
    }
    
    sum2 = Math.min(tmp1, tmp2);
    
    return Math.min(sum1, sum2);
  }
  
  public static int binarySearch(long[] a, long x){
    int i = Arrays.binarySearch(a, x);
    if(i >= 0){
      return i;
    }else{
      i = ~i;
      if(i == a.length){
        return i - 1;
      }
      if(i == 0){
        return i;
      }
      if(Math.abs(a[i] - x) == Math.abs(a[i-1] - x)){
        return ~i;
      }else{
        return Math.abs(a[i] - x) < Math.abs(a[i-1] - x) ? i : i - 1;
      }
    }
  }
}