import java.util.*;
import java.io.*;
import java.math.*;
import java.awt.geom.*;
 class Main{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int c[][]=new int[4][4];
        for(int i=1;i<=3;i++)
            for(int j=1;j<=3;j++){
                c[i][j]=sc.ni();
            }
        boolean f=true;
        HashSet<Integer> hs=new HashSet<>();
        hs.add(c[1][1]-c[2][1]);hs.add(c[1][2]-c[2][2]);hs.add(c[1][3]-c[2][3]);
        if(hs.size()>1) f=false;
        hs.clear();

        hs.add(c[2][1]-c[3][1]);hs.add(c[2][2]-c[3][2]);hs.add(c[2][3]-c[3][3]);
        if(hs.size()>1) f=false;
        hs.clear();
        
        hs.add(c[1][1]-c[3][1]);hs.add(c[1][2]-c[3][2]);hs.add(c[1][3]-c[3][3]);
        if(hs.size()>1) f=false;
        hs.clear();

        hs.add(c[1][1]-c[1][2]);hs.add(c[2][1]-c[2][2]);hs.add(c[3][1]-c[3][2]);
        if(hs.size()>1) f=false;
        hs.clear();

        hs.add(c[1][2]-c[1][3]);hs.add(c[2][2]-c[2][3]);hs.add(c[3][2]-c[3][3]);
        if(hs.size()>1) f=false;
        hs.clear();

        hs.add(c[1][1]-c[1][3]);hs.add(c[2][1]-c[2][3]);hs.add(c[3][1]-c[3][3]);
        if(hs.size()>1) f=false;
        hs.clear();

        if(!f) System.out.println("No");
        else System.out.println("Yes");
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