
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int M=gi();
         int[] x=new int[M];
         int[] y=new int[M];
         boolean[] f=new boolean[N];

         for(int i=0; i<M;i++) {
        	 x[i]=gi()-1;
        	 y[i]=gi()-1;
         }
         int[] c=new int[N];

         for(int i=0; i<N;i++) {
              c[i]=1;
         }
         f[0]=true;

         int ans=0;
         for (int i=0; i<M;i++) {
        	 c[x[i]]--;
        	 c[y[i]]++;
        	 if(f[x[i]])f[y[i]]=true;
        	 if(c[x[i]]==0)f[x[i]]=false;
         }

         for(int i=0; i<N;i++) {
             if(f[i])ans++;
        }
         System.out.println(ans);
         //System.out.println(ans);
     }

     public static class Edge {
    	    private int from;
    	    private int to;
    	    private long cost;

    	    public Edge(int f, int t, long c) {
    	    	this.from=f;
    	    	this.to=t;
    	    	this.cost=c;
    	    }
    	}
     // 文字列として入力を取得
     public static String gs() {
          return scanner.next();
     }

     // intとして入力を取得
     public static int gi() {
          return Integer.parseInt(scanner.next());
     }

     // longとして入力を取得
     public static long gl() {
          return Long.parseLong(scanner.next());
     }

     // doubleとして入力を取得
     public static double gd() {
          return Double.parseDouble(scanner.next());
     }
}