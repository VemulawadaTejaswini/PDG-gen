import java.util.*;
import java.math.*;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int[] a = new int[n];
    for(int i = 0;i<n;i++) {
      a[i] = stdIn.nextInt();
      a[i] = Math.abs(a[i]);
    }
    int min = a[0];
    int k = 0;
    if(n%2==1)  k =addArray(a);
    if(n%2==0) {
      for(int i = 0;i>a.length;i++) {
      if(min>a[i]) min = a[i];
    }
    k = addArray(a);
    k = k - 2*min;
    }
    System.out.println(k);
  }
  static int addArray(int[] a) {
    int count = 0;
    for(int i = 0;i<a.length;i++) {
      count += a[i];
    }
    return count;
  }
}