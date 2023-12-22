import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int v = scan.nextInt();
    int p = scan.nextInt();
    int[] ar = new int[n];
    for (int i = 0; i < ar.length; i++) {
      ar[i] = scan.nextInt();
    }

    Arrays.sort(ar);

    // binary search the answer
    int l = -1;
    int r = n - 1;
    int target = ar[n - p];
    int totalVote = m * (n-v);
    while (l+1 < r) {
      int mid = (r + l) / 2;
      if (mid >= n - p) {
        r = mid;
      } else {
        if (ar[mid] + m < target) {
          l = mid;
        } else {
          int max = ar[mid] + m;
          int nv = 0;
          boolean able = true;
          for (int i = mid + 1; i <= n - p; i++) {
              int x=m - (max-ar[i]);
              if(x > m){
                  able = false;
                  break;
              }
              nv+=x;
          }

          if(nv > totalVote || !able){
              l = mid;
          }else{
              r = mid;
          }
        }
      }
    }
    System.out.println(n - r);
  }
}