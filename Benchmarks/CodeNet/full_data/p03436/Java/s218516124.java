import java.util.*;
import java.io.*;
import java.math.*;
import java.awt.geom.*;
 class Main{
    static int h,w;
    static char arr[][];
    static int dr[]={1,0,-1,0};
    static int dc[]={0,1,0,-1};
    static int mem[][];
    static int status[][]; // 0 for white, 1 for grey, 2 for black
    public static void bfs(){
        ArrayDeque<Integer> rq=new ArrayDeque<>();
        ArrayDeque<Integer> cq=new ArrayDeque<>();
        rq.addLast(1);
        cq.addLast(1);
        mem[1][1]=1;
        while(!rq.isEmpty()){
            int r=rq.removeFirst();
            int c=cq.removeFirst();
            for(int i=0;i<4;i++){
                int R=dr[i]+r;
                int C=dc[i]+c;
                if(R>=1 && R<=h && C>=1 && C<=w && status[R][C]==0 && arr[R][C]!='#'){
                    rq.addLast(R);cq.addLast(C);
                    status[R][C]=1;
                    mem[R][C]=mem[r][c]+1;
                }
            }
            status[r][c]=2;
        }//end of while
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        h=sc.ni();
        w=sc.ni();
        arr=new char[h+1][w+1];
        mem=new int[h+1][w+1];
        status=new int[h+1][w+1];
        int hash=0;
        for(int i=1;i<=h;i++){
            String s=sc.next();
            for(int j=1;j<=w;j++){
                if(s.charAt(j-1)=='#') hash++;
                arr[i][j]=s.charAt(j-1);
            }
        }
        bfs();
        if(mem[h][w]==0) System.out.println(-1);
        else{
            int ans=h*w-hash-mem[h][w];
            System.out.println(ans);
        }
    }

    private static class MyScanner {
      BufferedReader br;
      StringTokenizer st;

      public MyScanner() {
         br = new BufferedReader(new InputStreamReader(System.in));
      }

      String next() {
          while (st == null || !st.hasMoreElements()) {
              try {
                  st = new StringTokenizer(br.readLine());
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
          return st.nextToken();
      }

      int ni() {
          return Integer.parseInt(next());
      }
      float nf() {
        return Float.parseFloat(next());
      }
      long nl() {
          return Long.parseLong(next());
      }

      double nd() {
          return Double.parseDouble(next());
      }

      String nextLine(){
          String str = "";
	  try {
	     str = br.readLine();
	  } catch (IOException e) {
	     e.printStackTrace();
	  }
	  return str;
      }
   }
}