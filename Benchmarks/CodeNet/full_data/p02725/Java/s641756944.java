import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long k = sc.nextLong();
    int n = sc.nextInt();
    long[] a = new long[n];
    long max = 0;
    long ans;

    for(int i = 0; i < n; i++){
      a[i] = sc.nextLong(); 
    }

    Arrays.sort(a);
    
    for(int i = 0; i < n - 1; i++){
      if(max < a[i + 1] - a[i]){
        max = a[i + 1] - a[i];
      }
    }

    ans = k - max;

    System.out.println(ans);
  }
}
