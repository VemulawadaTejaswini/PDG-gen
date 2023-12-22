import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int k = sc.nextInt();

      int[] a = new int[n];
      for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
      }

      int cnt1 = 0;
      int cnt2 = 0;
      int cnt = 0;
      long ans = 0;

      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
          if(a[i]>a[j]){
            cnt1++;
          }
        }
        for(int j=i-1;j>=0;j--){
          if(a[i]>a[j]){
            cnt2++;
          }
        }
        cnt = cnt1 + cnt2;
        ans += k*cnt1 + (k-1)*cnt;
        ans = ans % 1000000007;
        cnt1 = 0;
        cnt2 = 0;
        cnt = 0;
      }

      System.out.println(ans);
    }
}
