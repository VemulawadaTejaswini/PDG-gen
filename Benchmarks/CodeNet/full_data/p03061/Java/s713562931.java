import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long[] a = new long[n];
    for(int i=0;i<n;i++){
      a[i] = scan.nextLong();
    }
    Arrays.sort(a);

    if (n == 2){
      System.out.println(a[0]);
      return;
    }

    long sum1 = gcd(a[2],a[1]);
    for (int j=3;j<n;j++){
      sum1 = gcd(a[j],sum1);
    }

    long sum2 = gcd(a[2],a[0]);
    for (int j=3;j<n;j++){
      sum2 = gcd(a[j],sum2);
    }

    long sum3 = gcd(a[1], a[0]);
    long prev = sum3;
    for (int k=2;k<n;k++){
      long current = gcd(a[k],sum3);
      if (current < sum3){
        if (current > prev){
          sum3 = current;
        }
        else{
          sum3 = prev;
        }

        prev = current;
      }
    }
    long g = (long) Math.max(sum1,sum2);
    g = (long) Math.max(g, sum3);
    System.out.println(g);
  }


  static long gcd(long a, long b){
    while (b > 0){
      long remain = a%b;
      a = b;
      b = remain;
    }
    return a;
  }
}
