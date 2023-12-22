import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int cnt=0;

      int n = sc.nextInt();
      int[] a = new int[n];

      for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
      }

      for(int i=0;i<n-2;i++){
        if(a[i]<a[i+1] && a[i+1]<a[i+2]){
          cnt++;
        }
        else if(a[i]>a[i+1] && a[i+1]>a[i+2]){
          cnt++;
        }
      }

      System.out.println(cnt);

    }
}
