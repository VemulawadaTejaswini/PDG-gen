import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());

    int[] a = new int[n];
    for(int i=0; i<n; i++){
      a[i] = Integer.parseInt(sc.next());
    }

    Arrays.sort(a);
    int ans = a[n-1]-a[0];
    System.out.println(ans);
  }  
}