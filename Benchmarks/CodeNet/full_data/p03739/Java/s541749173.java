import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    long[] a = new long[n+1];
    long[] b = new long[n+1];
    long ans1 =0, ans2 =0,total =0;
    
    //a[1]を+とするケース
    for (int i =1; i<=n; i++) {
      a[i] = Long.parseLong(sc.next());
      b[i] = a[i];
      total += a[i];
      if (i % 2 == 1 && total <=0) {
        ans1 += 1 - (total);
        a[i] += ans1;
        total += ans1;
      }
      if (i % 2 == 0 && total >=0) {
        ans1 += 1 + total;
        a[i] += -ans1;
        total += -ans1;
      }
    }
    
    total =0;
    
     //a[1]を-とするケース
    for (int i =1; i<=n; i++) {
      total += b[i];
      if (i % 2 == 0 && total <=0) {
        ans2 += 1 - (total);
        b[i] += ans2;
        total += ans2;
      }
      if (i % 2 == 1 && total >=0) {
        ans2 += 1 + total;
        b[i] += -ans2;
        total += -ans2;
      }
    }   
    System.out.print(Math.min(ans1,ans2));
  }
}