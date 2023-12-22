import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}//standard output
        static void myerr(Object t){System.err.println(t);}//standard error
        static String getStr(){return sc.next();}
        static int getInt(){return Integer.parseInt(getStr());}
        static long getLong(){return Long.parseLong(getStr());}
        static boolean isNext(){return sc.hasNext();}
        static char[] mySplit(String str){return str.toCharArray();}
        public static void main(String[] args){
          int H = getInt();
          int W = getInt();
          char[][] masu = new char[H][W];
          //q内要素が多いと時間かかる
          ArrayDeque<int[]> q = new ArrayDeque<int[]>();
          for(int i = 0; i < H; i++){
            masu[i] = mySplit(getStr());
          }
          
          for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
              if(masu[i][j] == '#'){
                //4方のうち、1か所でも.があればqに追加
                if(i != 0 && masu[i - 1][j] == '.' || 
                  j != 0 && masu[i][j - 1] == '.' || 
                  i != H - 1 && masu[i + 1][j] == '.' || 
                  j != W - 1 && masu[i][j + 1] == '.'){
                  int[] mp = {i, j ,0};
                  q.add(mp);
                }
              }
            }
          }
          
          int output = 0;
          
          
          //myerr(q);
          while(!q.isEmpty()){
            int[] tmp = q.poll();
            int y = tmp[0];
            int x = tmp[1];
            int count = tmp[2];
            //myerr(y + " " + x);
            output = Math.max(output,count);
            if(y != 0 && masu[y - 1][x] == '.'){
                int[] mp = {y- 1, x ,count + 1};
                masu[y - 1][x] = '#';
                q.add(mp);
            }
            if(x != 0 && masu[y][x - 1] == '.'){
                int[] mp = {y, x - 1, count + 1};
              	masu[y][x - 1] = '#';
                q.add(mp);
            }
            if(y != H - 1 && masu[y + 1][x] == '.'){
                int[] mp = {y + 1, x, count + 1};
              	masu[y + 1][x] = '#';
                q.add(mp);
            }
            if(x != W - 1 && masu[y][x + 1] == '.'){
              	int[] mp = {y, x + 1, count + 1};
              	masu[y][x + 1] = '#';
                q.add(mp);
            }
          }
          myout(output);
        }
        //Method addition frame start

        //Method addition frame end
}
