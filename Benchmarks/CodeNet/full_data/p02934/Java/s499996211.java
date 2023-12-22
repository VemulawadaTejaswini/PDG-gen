import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[n];
    double numer = 1;
    double denom = 0;
    double ans;

    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
      numer *= a[i];
    }

    for(int i = 0; i < n; i++){
      denom +=  numer / a[i];
    }
    
    ans = numer / denom;
    System.out.println(ans);
  }
}
