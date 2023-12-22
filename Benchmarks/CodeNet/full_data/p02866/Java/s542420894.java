import java.util.*;
class Main{
  static int mod = 998244353;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] d = new int[n];
    int max =0;
    for (int i=0;i<n;i++){
      d[i] = sc.nextInt();
      max = Math.max(max,d[i]);
    }
    sc.close();
    if (d[0] != 0){
      System.out.println(0);
      System.exit(0);
    }
    long[] a = new long[max+1];
    for (int i=0;i<n;i++){
      a[d[i]]++;
    }
    if (a[0] != 1){
      System.out.println(0);
      System.exit(0);
    }
    long ans = 1;
    for (int i=0;i<max;i++){
      if (a[i] == 0){
        System.out.println(0);
        System.exit(0);
      }
      ans *= Math.pow(a[i],a[i+1]);
      ans %= mod;
    }
    System.out.println(ans);
  }
}