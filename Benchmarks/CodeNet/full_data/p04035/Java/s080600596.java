import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
  static int n;
  static long l;
  static long[] a;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt(); l = sc.nextInt();
    a = new long[n];
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
    }

    long[] sum = new long[n];
    sum[0] = a[0];
    for(int i = 1; i < n; i++){
      sum[i] = sum[i - 1] + a[i];
    }

    boolean[] c = new boolean[n - 1];
    for(int i = 0; i < n - 1; i++){
      c[i] = true;
    }

    Set< Interval > intervals = new TreeSet< Interval >();
    intervals.add(new Interval(0, n, sum[n - 1]));
    int[] ans = new int[n - 1];
    int sp = 0;
    for(;;){
      Set< Interval > nintervals = new TreeSet< Interval >();
      for(Interval inter : intervals){
        if(inter.sum < l){
          if(inter.t - inter.s != 1){
            System.out.println("Impossible");
            return;
          }
          continue;
        }
        int s = inter.s, t = inter.t;
        for(int j = s; j < t - 1; j++){
          if(c[j] && a[j] + a[j + 1] < l){
            c[j] = false;
            ans[sp++] = j + 1;
            Interval i1 = new Interval(s, j + 1, sum[j] - (s - 1 >= 0 ? sum[s - 1] : 0));
            Interval i2 = new Interval(j + 1, t, sum[t - 1] - sum[j]);
            nintervals.add(i1);  nintervals.add(i2);
            break;
          }
        }
      }
      if(nintervals.size() == 0){
        break;
      }
      intervals = nintervals;
    }

    int count = intervals.size();
    for(Interval inter : intervals){
      for(int j = inter.s; j < inter.t - 1; j++){
        if(c[j] && a[j] + a[j + 1] >= l){
          ans[sp++] = j + 1;
          c[j] = false;
        }
      }
    }

    if(sp == n - 1){
      System.out.println("Possible");
      for(int i = 0; i < n - 1; i++){
        System.out.println(ans[i]);
      }
    }
    else{
      System.out.println("Impossible");
    }
  }

  static class Interval implements Comparable< Interval > {
    int s, t;
    long sum;

    Interval(int s, int t, long sum){
      this.s = s; this.t = t;
      this.sum = sum;
    }

    @Override
    public int compareTo(Interval i){
      if(s == i.s){
        return t - i.t;
      }
      return s - i.s;
    }
  }
}