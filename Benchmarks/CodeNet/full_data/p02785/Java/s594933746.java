import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long sum = 0;
    int k = scan.nextInt();
    if (n<=k){
      System.out.println(0);
      return;
    }
    int [] a = new int[n];
    for (int i=0;i<n;i++){
      a[i] = scan.nextInt();
    }

    for (int i=0; i<n;i++){
      for (int j=i+1;j<n;j++){
        if (a[i] > a[j]){
          int g = a[i];
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
