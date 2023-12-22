import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());

      int[] a = new int[n];

      for(int i=0;i<n;i++){
        a[i] = Integer.parseInt(sc.next());
      }

      String ans = "No";

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

      int flag = 0;

//////case1///////////////////////////////////
      if(cnt==n){
        ans = "Yes";
        flag = 1;
      }
//////////////////////////////////////////////

//////case2///////////////////////////////////
      if(n%3==0 && cnt==n/3 && max==min){
        ans = "Yes";
        flag = 1;
      }
//////////////////////////////////////////////

//////case3///////////////////////////////////
if(flag==0){
      Arrays.sort(a);
      cnt=0;
      for(int i=0;i<n-1;i++){
        if(a[i]!=a[i+1]){
          cnt++;
        }
      }
      if(cnt==2){ans = "Yes";}
}
//////////////////////////////////////////////

      System.out.println(ans);

    }
}
