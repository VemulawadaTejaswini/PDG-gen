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
    long sum1;
    int i = binarySearch(a, x);
    
    long tmp1 = 0;
    tmp1 = Math.abs(x - a[i]);
    int ti = binarySearch(b, a[i]);
    long tp = Math.abs(a[i] - b[ti]);
    if(ti - 1 >= 0){
      tp = Math.min(tp, Math.abs(a[i] - b[ti-1]));
    }
    tmp1 += tp;

    long tmp2 = Long.MAX_VALUE;
    if(i - 1 >= 0){
      tmp2 = Math.abs(x - a[i-1]);
      ti = binarySearch(b, a[i-1]);
      tp = Math.abs(a[i-1] - b[ti]);
      if(ti - 1 >= 0){
        tp = Math.min(tp, Math.abs(a[i-1] - b[ti-1]));
      }
      tmp2 += tp;
    }
    sum1 = Math.min(tmp1, tmp2);

    long sum2;
    i = binarySearch(b, x);
    tmp1 = Math.abs(x - b[i]);
    ti = binarySearch(a, b[i]);
    tp = Math.abs(a[ti] - b[i]);
    if(ti - 1 >= 0){
      tp = Math.min(tp, Math.abs(a[ti-1] - b[i]));
    }
    tmp1 += tp;

    tmp2 = Long.MAX_VALUE;
    if(i - 1 >= 0){
      tmp2 = Math.abs(x - b[i-1]);
      ti = binarySearch(a, b[i-1]);
      tp = Math.abs(a[ti] - b[i-1]);
      if(ti - 1 >= 0){
        tp = Math.min(tp, Math.abs(a[ti-1] - b[i-1]));
      }
      tmp2 += tp;
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
      return i;
    }
  }
}