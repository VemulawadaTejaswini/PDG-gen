import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());

      int[] a = new int[n];

      for(int i=0;i<n;i++){
        a[i] = Integer.parseInt(sc.next());
      }

      String ans = "aaa";

      int cnt = 0;

      for(int i=0;i<n;i++){
        if(a[i]==0){
          cnt++;
        }
      }

      int max = 0;
      int min = 1000000007;

      for(int i=0;i<n;i++){
        if(a[i]>max && a[i]!=0){
          max = a[i];
        }
        if(a[i]<min && a[i]!=0){
          min = a[i];
        }
      }

      if(cnt==n){
        ans = "Yes";
      }
      if(n%3==0 && cnt==n/3 && max==min){
        ans = "Yes";
      }

      System.out.println(ans);

    }
}
