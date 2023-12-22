import java.util.Scanner;

public class Main {

	static Scanner scanner;

	static boolean[][] cg;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int M=gi();
	    int[][] g=new int[N][N];
	    cg=new boolean[N][N];
	    boolean[] f=new boolean[M];

        for (int i=0; i< N;i++) {
        	for(int j=0; j<N;j++) {
        		if(i!=j) {
        		    g[i][j]=Integer.MAX_VALUE;
        		} else {
        			g[i][j]=0;
        		}
        	}
        }

        for (int i=0; i<M;i++) {
        	int a=gi();
        	int b=gi();
        	int c=gi();
        	g[a-1][b-1]=c;
        	g[b-1][a-1]=c;
		    cg[a-1][b-1]=true;
		    cg[b-1][a-1]=true;
        }

        for (int i=0; i<N;i++) {
            dikstra(g, i);
        }

        int ans=0;
        for (int i=0; i<N;i++) {
        	for (int j=0; j<N;j++) {
            	if(cg[i][j]==true)ans++;
            }
        }

        System.out.println(ans/2);
	}

	public static int[] dikstra(int[][] g, int s){
        int[] k=new int[g.length];
        int[] prev=new int[g.length];
        boolean[] f=new boolean[g.length];
        for (int i=0; i<g.length; i++) {
        	k[i]=Integer.MAX_VALUE;
        }
        k[s]=0;
        while(true) {
        	int v=-1;
        	for(int i=0; i<g.length;i++) {
        		if(!f[i] && (v==-1 || k[i]<k[v])) {
        			v=i;
        		}
        	}
        	if(v==-1)break;
        	f[v]=true;

        	for(int i=0; i<g.length; i++) {
        		if (k[i]>k[v]+g[v][i]) {
        		   prev[i]=v;
        		   k[i]=k[v]+g[v][i];
        		}
        	}
        }

        for (int i=0; i<g.length;i++) {
        	cg[i][prev[i]]=false;
        	cg[prev[i]][i]=false;
        }

        return k;
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