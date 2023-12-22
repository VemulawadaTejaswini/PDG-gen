import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());
      int k = Integer.parseInt(sc.next());

      int[] p = new int[n];
      int[] ud = new int[n-1];
      for(int i=0;i<n;i++){
        p[i] = Integer.parseInt(sc.next());
      }
      for(int i=0;i<n-1;i++){
        if(p[i]<p[i+1]){
          ud[i] = 1;
        }
        else{
          ud[i] = 0;
        }
      }

      int ans = 0;

      int flag = 0;

      int max = 0;
      int min = 1000000;

      for(int i=0;i<=n-k;i++){
        for(int j=i;j<i+k-1;j++){
          if(ud[j]==0){
            ans++;
            break;
          }
          else if(flag==0 && j==i+2){
            ans++;
            flag = 1;
          }
        }
      }

      System.out.println(ans);

    }
}
