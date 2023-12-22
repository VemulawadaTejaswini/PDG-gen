import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n=sc.nextInt();

      n=n+1;

      int[] a = new int[n];

      for(int i=1;i<n;i++){
        a[i]=sc.nextInt();
      }

      int[] ans = new int[n];

      int sum1=0;
      int cnt=0;
      int flag=0;

      for(int i=n-1;i>=1;i--){
      //////////////////////////////////////////////////////
        if(n/2<=i){
          ans[i] = a[i];
        }
        else{
          cnt=i;
          for(int j=i;j<n;j+=cnt){
            sum1 = sum1 + a[j];
          }
          sum1 = sum1 % 2;
          //////////////////////////////////////////
          if(sum1==a[i]){
            ans[i] = sum1;
          }
          else{
            System.out.println("-1");
            flag = 1;
            break;
          }
          /////////////////////////////////////////
        }
      /////////////////////////////////////////////////////
      }

    if(flag==0){
    ////////////////////////////////////////
      int m=0;
      for(int i=1;i<n;i++){
        m = m + ans[i];
      }

      System.out.println(m);

      for(int i=1;i<n;i++){
        if(ans[i]==1){
          System.out.println(a[i]);
        }
      }
    /////////////////////////////////////////
    }

    }
}
