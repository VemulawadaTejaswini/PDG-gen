import java.util.Scanner;

public class Main {
  static int n;
  static long x;
  static long[] a;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt(); x = sc.nextInt();
    a = new long[n];
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
    }

    long sum = 0;
    for(int i = 1; i < n - 1; i++){
      if(x > 0 && a[i - 1] + a[i] > x && a[i] + a[i + 1] > x){
        long diff = Math.max(a[i - 1] + a[i] - x, a[i] + a[i + 1] - x);
        sum += diff;  a[i] -= diff;
      }
    }

    for(int i = 0; i < n - 1; i++){
      if(a[i] > 0 && a[i] + a[i + 1] > x){
        long diff = a[i] + a[i + 1] - x;
        sum += diff;  a[i] -= diff;
      }
    }

    for(int i = 1; i < n; i++){
      if(a[i - 1] + a[i] > x){
        long diff = a[i - 1] + a[i] - x;
        sum += diff;  a[i] -= diff;
      }
    }

    System.out.println(sum);
  }
}
