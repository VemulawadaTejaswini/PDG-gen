import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long[] a = new long[n];
    long[] g = new long[n];

    for(int i=0;i<n;i++){
      a[i] = scan.nextLong();
      g[i] = a[i];
    }

    Arrays.sort(a);
    int b = (int) (n-1)/2;
    int c = b+1;
    long d = a[b];
    long e = a[c];

    for(int i=0;i<n;i++){
      if (g[i] <= d){
        System.out.println(e);
      }
      else{
        System.out.println(d);
      }
    }

  }
}
