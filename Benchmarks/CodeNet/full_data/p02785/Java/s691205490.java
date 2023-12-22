import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long sum = 0;
    int k = scan.nextInt();
    long [] a = new long[n];
    for (int i=0;i<n;i++){
      a[i] = scan.nextLong();
    }
    for (int i=0; i<n;i++){
      for (int j=i;j<n;j++){
        if (a[i] > a[j]){
          long g = a[i];
          a[i] = a[j];
          a[j] = g;
        }
      }
    }
    int p = n-k;
    for (int t = 0; t<p;t++){
      sum += a[t];
    }
    System.out.println(sum);
  }

}
