import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n=sc.nextInt();
      int m=sc.nextInt();

      int ans = 1;
      int flag = 1;

      int[] a = new int[m];

      for(int i=0;i<m;i++){
        a[i]=sc.nextInt()-1;
      }

      //////////ERROR//////////////////////
      for(int i=0;i<m-1;i++){
        if(a[i+1]==a[i]+1){
          flag = 0;
          break;
        }
      }
      ////////////////////////////////////

      //////////broken check///////////////
      int[] stair = new int[n];
      for(int i=0;i<n;i++){
        stair[i] = i;
        for(int j=0;j<m;j++){
          if(i==a[j]){
            stair[i] = -1;
          }
        }
      }
      /////////////////////////////////////

      ///////////////////////////////////////////////
      for(int i=-1;i<n-2;i++){
        if(stair[i+1]!=-1 && stair[i+2]!=-1){
          ans *= 2;
          ans = ans % 1000000007;
          i++;
        }
        else if(stair[i+1]!=-1){
          i+=2;
        }
        else{
          i++;
        }
      }
      ///////////////////////////////////////////////




      if(flag==0){
        System.out.println("0");
      }
      else{
        System.out.println(ans);
      }
/*
      for(int i=0;i<n;i++){
        System.out.print("stair=");
        System.out.println(stair[i]);
      }
*/

    }
}
