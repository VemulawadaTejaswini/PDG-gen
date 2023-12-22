import java.util.Scanner;

public class Main {
  static int n;
  static int[] t, a;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    t = new int[n]; a = new int[n];
    for(int i = 0; i < n; i++){
      t[i] = sc.nextInt();  a[i] = sc.nextInt();
    }

    long tc = t[0], ac = a[0];
    for(int i = 1; i < n; i++){
      if(ac >= tc){
        if(ac % a[i] != 0){
          ac = Math.max(a[i], (ac / (long)a[i]) * (long)a[i] + (long)a[i]);
        }
        tc = ac / (long)a[i] * (long)t[i];
      }
      else{
        if(tc % t[i] != 0){
          tc = Math.max(t[i], (tc / (long)t[i]) * (long)t[i] + (long)t[i]);
        }
        ac = tc / (long)t[i] * (long)a[i];
      }
    }

    long sum = tc + ac;
    System.out.println(sum);
  }
}
