import java.util.*;

//6 and 7 is WA or RE

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int h = Integer.parseInt(sc.next());
      int w = Integer.parseInt(sc.next());
      int k = Integer.parseInt(sc.next());

      //char[][] c = new char[h][w];
      int[][] ans = new int[h][w];
      int cnt = 1;
      for(int i=0;i<h;i++){
        String s = sc.next();
        for(int j=0;j<w;j++){
          char c = s.charAt(j);
          if(c=='#'){
            ans[i][j] = cnt;
            cnt++;
          }
        }
      }
      cnt=0;

      //same as hidari
      for(int i=0;i<h;i++){
        for(int j=1;j<w;j++){
          if(ans[i][j]==0){
              ans[i][j] = ans[i][j-1];
          }
        }
      }
      //same as migi
      for(int i=0;i<h;i++){
        for(int j=(w-2);j>=0;j--){
          if(ans[i][j]==0){
              ans[i][j] = ans[i][j+1];
          }
        }
      }

      //nanimonai
      for(int i=1;i<h;i++){
        cnt = 0;
        for(int j=0;j<w;j++){
          cnt += ans[i][j]; // calc all sum in i;
        }
        if(cnt==0){ // all 0
          for(int j=0;j<w;j++){
            ans[i][j] = ans[i-1][j]; //ue wo copy
          }
        }
      }

      //nanimonai2
      for(int i=(h-2);i>=0;i--){
        cnt = 0;
        for(int j=0;j<w;j++){
          cnt += ans[i][j]; // calc all sum in i;
        }
        if(cnt==0){ // all 0
          for(int j=0;j<w;j++){
            ans[i][j] = ans[i+1][j]; //shita wo copy
          }
        }
      }





      output(ans,h,w);
    }


    public static void output(int[][] ans,int h,int w){
      for(int i=0;i<h;i++){
        for(int j=0;j<w;j++){
          System.out.print(ans[i][j]+" ");
        }
        System.out.println("");
      }
    }
}
