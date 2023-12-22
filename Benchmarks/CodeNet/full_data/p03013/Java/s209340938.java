import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n=sc.nextInt();
      int m=sc.nextInt();

      int flag = 1;

      int[] a = new int[m];

      int[] way = new int[n];

      for(int i=0;i<m;i++){
        a[i]=sc.nextInt()-1;
      }

      if(n>=3){

        if(a[0]!=0){
          way[0] = 1;
        }
        else{
          way[0] = 0;
        }

        if(a[0]!=1 || a[0]!=1){
          way[1] = 2;
        }
        else{
          way[1] = 0;
        }

      //////////ERROR//////////////////////
      for(int i=0;i<m-1;i++){
        if(a[i+1]==a[i]+1){
          flag = 0;
          break;
        }
      }
      ////////////////////////////////////

      int ccnt = 0;
      //////////broken record///////////////
      for(int i=2;i<n;i++){
        for(int j=ccnt;j<m;j++){
          if(i==a[j]){
            way[i] = -1;
            ccnt++;
            break;
          }
        }
      }
      /////////////////////////////////////


      for(int i=2;i<n;i++){
        if(way[i]!=-1){
          way[i] = way[i-1] + way[i-2];
        }
        else{
          way[i] = 0;
        }
      }



    }
    else{
      way[n-1] = n;
    }

      int ans = way[n-1] % 1000000007;

      if(flag==0){
        System.out.println("0");
      }
      else{
        System.out.println(ans);
      }

    }
}
