import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
 
class person{
  int where;
  int nowtime;
  int coin;
  int pointscount;
  int[][] getpoints = new int[200][2];
} 
 
public class Main {
  public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);
 
 
    int n = sc.nextInt();//都市数
    int m = sc.nextInt();//鉄道数
    int s = sc.nextInt();//銀貨数kazu
    int[][] trains = new int[m][4];
    for(int i = 0; i < m; i++){
      trains[i][0] = sc.nextInt();
      trains[i][1] = sc.nextInt();
      trains[i][2] = sc.nextInt();
      trains[i][3] = sc.nextInt();
    }

    int[][] changepoints = new int[n][2];//0の方の数に[1]分かけて交換可能
    for(int i = 0; i < m; i++){
      changepoints[i][0] = sc.nextInt();
      changepoints[i][1] = sc.nextInt();      
    }
 
    LinkedList<person> minroots = new LinkedList<person>();
    person startpoint = new person();
    startpoint.where = 0;
    startpoint.nowtime = 0;
    startpoint.coin = s;
    startpoint.pointscount = 1;
    startpoint.getpoints[0][0] = changepoints[0][0];
    startpoint.getpoints[0][1] = changepoints[0][1];
    
    minroots.add(startpoint); 

    long[] minmap = new long[n];
    minmap[0] = 0;
    for(int i = 1; i < n; i++){
      minmap[i] = 999999999999;
    }

    while(minroots.size() > 0){
      person nowperson = minroots.poll();
      int nextpoint = -1;
      for(int i = 0; i < m; i++){
        nextpoint = -1;
        if(trains[i][0] == nowperson.where){
          nextpoint = trains[i][1];
        }else if(trains[i][1] == nowperson.where){
          nextpoint = trains[i][0];
        }

        if(nextpoint >= 0){
          if(nowperson.coin >= trains[i][2]){
            person nextperson = new person();
            nextperson.where = nextpoint;
            nextperson.nowtime = nowperson.time + trains[i][3];
            nextperson.coin = nowperson.coin - trains[i][2];
            nextperson.pointscount = nowperson.pointscount + 1;
            nextperson.getpoints[nowperson.pointscount][0] = changepoints[nowperson.where].[0];
            nextperson.getpoints[nowperson.pointscount][1] = changepoints[nowperson.where].[1];
            minroots.add(nextperson);
          }else{//手持ちの銀貨じゃ足りなかった場合
            int fusoku = trains[i][2] - nowperson.coin;
            long[] dp = new long[101]; //dp[x]はx枚得るときの最小経過時間
            dp[0] = 0;
            for(int j = 1; j < 101; j++){
              dp[j] = 999999999999;
            }

            for(int j = 0; j < nowperson.pointscount; j++){
              int nowcanget = nowperson.changepoints[j][0];
              int nowspent = nowperson.changepoints[j][1];
              for(int k = 0; k + nowcanget < 101; k++){
                if(dp[k + nowcanget] > dp[k] + nowspent){
                  dp[k + nowcanget] = dp[k] + nowspent;
                }
              }
              int mintime = dp[fusoku];
              if(dp[fusoku] = 999999999999){
                for(int k = 0; k < nowperson.pointscount; k++){
                  if(mintime > nowperson.changepoints[k][1]){
                    mintime = nowperson.changepoints[k][1];
                  }
                }
              }

            person nextperson = new person();
            nextperson.where = nextpoint;
            nextperson.nowtime = nowperson.time + trains[i][3] + mintime;
            nextperson.coin = nowperson.coin - trains[i][2] + nowperson.changepoints[k][0];
            nextperson.pointscount = nowperson.pointscount + 1;
            nextperson.getpoints[nowperson.pointscount][0] = changepoints[nowperson.where].[0];
            nextperson.getpoints[nowperson.pointscount][1] = changepoints[nowperson.where].[1];
            minroots.add(nextperson);



            }
          }

        }
      }

    }

    for(int i = 1; i <　n; i++){
      System.out.println(minmap[i]);
    }

 
  }
 
 //ここからテンプレ
  static class InputReader {
      private InputStream stream;
      private byte[] buf = new byte[1024];
      private int curChar;
      private int numChars;
      private SpaceCharFilter filter;
 
      public InputReader(InputStream stream) {
          this.stream = stream;
      }
 
      public int next() {
          if (numChars == -1)
              throw new InputMismatchException();
          if (curChar >= numChars) {
              curChar = 0;
              try {
                  numChars = stream.read(buf);
              } catch (IOException e) {
                  throw new InputMismatchException();
              }
              if (numChars <= 0)
                  return -1;
          }
          return buf[curChar++];
      }
 
      public String nextStr() {
        int c = next();
        while(isSpaceChar(c)){c = next();}
        StringBuffer str = new StringBuffer();
        do{
          str.append((char)c);
          c = next();
        }while(!isSpaceChar(c));
        return str.toString();
      }
 
      public char nextChar() {
        int c = next();
        while(isSpaceChar(c)){c = next();}
        char ret;
        do{
          ret = (char)c;
          c = next();
        }while(!isSpaceChar(c));
        return ret;
      }
 
      public int nextInt() {
          int c = next();
          while (isSpaceChar(c))
              c = next();
          int sgn = 1;
          if (c == '-') {
              sgn = -1;
              c = next();
          }
          int res = 0;
          do {
              if (c < '0' || c > '9')
                  throw new InputMismatchException();
              res *= 10;
              res += c - '0';
              c = next();
          } while (!isSpaceChar(c));
          return res * sgn;
      }
 
      public boolean isSpaceChar(int c) {
          if (filter != null)
              return filter.isSpaceChar(c);
          return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
      }
 
      public interface SpaceCharFilter {
          public boolean isSpaceChar(int ch);
      }
  }
}