import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Main m = new Main();
		//*
		m.input();
		m.solve();
		m.output();
		/*/
		m.debug();
		//*/
	}
	
//	public void debug() {
//	}
	
	//InputUtil in = new InputUtil();
	PrintWriter out = new PrintWriter(System.out);
	
	int H = 0;
	int W = 0;
	int D = 0;
	int[] A = null;
	int Q = 0;
	int[] L = null;
	int[] R = null;
	int[] AX = null;
	int[] AY = null;
	long[] AD = null;
//	int M = 0;
//	int[] A = null;
//	String S = null;

//	boolean ansb = false;
	long[] ans = null;
	
	public void input() throws IOException {
//		N = in.nextInt();
//		M = in.nextInt();
//		A = in.nextInt(new int[N]);
//		S = in.nextLine();
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		D = sc.nextInt();
		A = new int[H*W];
		for (int i=0; i<A.length; i++) {
			A[i] = sc.nextInt();
		}
		Q = sc.nextInt();
		L = new int[Q];
		R = new int[Q];
		for (int i=0; i<Q; i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}
		AX = new int[H*W];
		AY = new int[H*W];
		for (int x=0; x<H; x++) {
			for (int y=0; y<W; y++) {
				int a = getA(x,y);
				AX[a-1] = x;
				AY[a-1] = y;
			}
		}
		AD = new long[H*W];
		for (int i=D; i<H*W; i++) {
			AD[i] = AD[i-D] + Math.abs(AX[i]-AX[i-D]) + Math.abs(AY[i]-AY[i-D]);
		}
		ans = new long[Q];
	}
	
	private int getA(int x, int y) {
		return A[y * H + x];
	}
	
	public void solve() throws IOException {
		for (int i=0; i<Q; i++) {
			int l = L[i];
			int r = R[i];
			ans[i] = AD[r-1] - AD[l-1];
		}
	}
	

	
	public void output() {
//		out.println(ansb?"Yes":"No");
		for (int i=0; i<Q; i++)
			out.println(ans[i]);
		out.flush();
	}
}

class OutputUtil {
	public static final String EOF = System.lineSeparator();

	public static void outputDivSpace(PrintWriter out, int[] a) {
		OutputUtil.output(out,a,0,a.length," ");
	}
	
	public static void outputDivEOF(PrintWriter out, int[] a) {
		OutputUtil.output(out,a,0,a.length,EOF);
	}
	
	public static void output(PrintWriter out, int[] a, int off, int len, String delim) {
		out.print(a[off]);
		for(int i=off+1; i<len; i++){
			out.print(delim);
			out.print(a[i]);
		}
		out.println("");
		out.flush();
	}
}
