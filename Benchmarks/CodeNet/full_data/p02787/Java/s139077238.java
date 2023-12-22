import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int h = scan.nextInt();
    int n = scan.nextInt();

    int[] a = new int[n];
    int[] b = new int[n];

    for (int i=0;i<n;i++){
      a[i] = scan.nextInt();
      b[i] = scan.nextInt();
    }

    long[] c = new long[h+1];
    Arrays.fill(c,Integer.MAX_VALUE);
    c[0] = 0;
    for (int i=0;i<h;i++){
      for (int j=0;j<n;j++){
        int target = i + a[j];
        if (target > h){
          target = h;
        }
        c[target] = Math.min(c[target], c[i] + b[j]);
      }
    }

    System.out.println(c[h]);


  }

}
