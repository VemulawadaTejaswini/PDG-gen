import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int k = sc.nextInt();
    int n = sc.nextInt();
    int[] a = new int[n];
    int ans;

    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt(); 
    }

    Arrays.sort(a);
    
    if(a[n - 1] - a[0] > k / 2){
      for(int i = 0; i < n; i++){
        if(a[i] > k / 2){
          a[i] = a[i] - k;
        }
      }
      Arrays.sort(a);
      ans = (a[0]) * (-1) + a[n - 1];
    } else {
      ans = a[n - 1] - a[0];
    }


    System.out.println(ans);
  }
}
