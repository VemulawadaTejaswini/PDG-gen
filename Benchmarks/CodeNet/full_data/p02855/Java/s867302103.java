import java.util.*;

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

      //same as hidari
      for(int i=0;i<h;i++){
        for(int j=0;j<w;j++){
          if(ans[i][j]==0){
            if(j==0){
              ans[i][j] = ans[i][j+1];
            }
            else{
              ans[i][j] = ans[i][j-1];
            }
          }
        }
      }
      //same as migi
      for(int i=0;i<h;i++){
        for(int j=(w-1);j>=0;j--){
          if(ans[i][j]==0){
            if(j==(w-1)){
              ans[i][j] = ans[i][j-1];
            }
            else{
              ans[i][j] = ans[i][j+1];
            }
          }
        }
      }

      //nanimonai
      for(int i=0;i<h;i++){
        cnt = 0;
        for(int j=0;j<w;j++){
          cnt += ans[i][j];
        }
        if(cnt==0){

          if(i==0){
            for(int j=0;j<w;j++){
              ans[0][j] = ans[1][j];
            }
          }
          else{
            for(int j=0;j<w;j++){
              ans[i][j] = ans[i-1][j];
            }
          }

        }
      }

      //nanimonai2
      for(int i=(h-1);i>=0;i--){
        cnt = 0;
        for(int j=0;j<w;j++){
          cnt += ans[i][j];
        }
        if(cnt==0){

          if(i==(h-1)){
            for(int j=0;j<w;j++){
              ans[h-1][j] = ans[h-2][j];
            }
          }
          else{
            for(int j=0;j<w;j++){
              ans[i][j] = ans[i+1][j];
            }
          }

        }
      }

      for(int i=0;i<h;i++){
        for(int j=0;j<w;j++){
          System.out.print(ans[i][j]+" ");
        }
        System.out.println("");
      }



    }
}
