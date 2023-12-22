import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] a = new int[n+2];
    for (int i=1;i<=n;i++){
      a[i] = scan.nextInt();
    }
    long sum = 0;
    for (int i=0;i<n+1;i++){
      sum += Math.abs(a[i+1]-a[i]);
    }

    for (int i=1;i<n+1;i++){
      System.out.println(find(a,i,sum));
    }

  }

  static long find(int[] a, int mid, long sum){
    if ((a[mid] >= a[mid-1]) && (a[mid] <= a[mid+1])){
      return sum;
    }
    if ((a[mid] <= a[mid-1]) && (a[mid] >= a[mid+1])){
      return sum;
    }

    if ((a[mid] == a[mid-1]) || (a[mid] == a[mid+1])){
      return sum;
    }

    sum += Math.abs(a[mid+1] - a[mid-1]);
    sum -= (Math.abs(a[mid-1] - a[mid]) + Math.abs(a[mid+1] - a[mid]));
    return sum;
  }
}
