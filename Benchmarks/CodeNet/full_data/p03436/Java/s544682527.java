import java.util.*;
import java.io.*;
import java.math.*;
import java.awt.geom.*;
 class Main{
    static int h,w,pathlen=0;
    static char arr[][];
    static boolean isPath=false;
    static int dr[]={1,0,-1,0};
    static int dc[]={0,1,0,-1};

    public static  void find(int r,int c){
        if(arr[r][c]=='#' || arr[r][c]=='@') return;
        arr[r][c]='@';
        if(!isPath)
           pathlen++;
        // System.out.println("debug:"+r+" "+c+" "+pathlen);
        if(r==h && c==w){
            isPath=true;
            return;
        }
        for(int i=0;i<4;i++){
            int R=r+dr[i];
            int C=c+dc[i];
            if(R>=1 && R<=h && C>=1 && C<=w)
                find(R,C);
        }
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        h=sc.ni();
        w=sc.ni();
        arr=new char[h+1][w+1];
        int hash=0;
        for(int i=1;i<=h;i++){
            String s=sc.next();
            for(int j=1;j<=w;j++){
                if(s.charAt(j-1)=='#') hash++;
                arr[i][j]=s.charAt(j-1);
            }
        }
        find(1,1);
        // System.out.println(isPath+" "+pathlen);
        if(!isPath) System.out.println(-1);
        else{
            int ans=h*w-hash-pathlen;
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