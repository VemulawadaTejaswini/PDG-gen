import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;

public class Main {
	static ContestScanner in;
	static Writer out;
	public static void main(String[] args) {
		Main main = new Main();
		try {
			in = new ContestScanner();
			out = new Writer();
			main.solve();
			out.close();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void solve() throws IOException {
		int n = in.nextInt();
		int m = in.nextInt();
		int q = in.nextInt();
		int[][] map = new int[n][m];
		for(int i = 0; i<n; i++) {
			char[] s = in.nextToken().toCharArray();
			for(int j = 0; j < m; j++) {
				map[i][j] = s[j] - '0';
			}
		}
		int[][] hor = new int[n][m-1];
		int[][] vir = new int[n-1][m];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j < m - 1; j++) {
				if(map[i][j] == 1 && map[i][j+1] == 1) hor[i][j] = 1;
			}
		}
		for(int j = 0; j < m; j++) {
			for(int i = 0; i < n - 1; i++) {
				if(map[i][j] == 1 && map[i + 1][j] == 1) vir[i][j] = 1;
			}
		}
		makeSum(map);
		makeSum(hor);
		makeSum(vir);
		for(int Q = 0; Q < q; Q++) {
			int t = in.nextInt() -1;
			int l = in.nextInt() -1;
			int b = in.nextInt() -1;
			int r = in.nextInt() -1;
			int all = sum(map, l, r, t, b);
			int mHor = sum(hor, l, r - 1, t, b);
			int mVir = sum(vir, l, r, t, b - 1);
			out.println(all - mHor - mVir);
		}
	}
	
	int[][] makeSum(int[][] res) {
		int h = res.length;
		int w = res[0].length;
		for(int i = 0; i < h; i++) {
			for(int j = 1; j < w; j++) {
				res[i][j] += res[i][j-1];
			}
		}
		
		for(int j = 0; j < w; j++) {
			for(int i = 1; i < h; i++) {
				res[i][j] += res[i-1][j];
			}
		}
		return res;
	}
	
	int sum(int[][] imos, int l, int r, int t, int b) {
		if(l > r || t > b) return 0;
		int plus = 0;
		int minus = 0;
		if(l > 0 && t > 0) {
			plus += imos[t-1][l-1];
		}
		if(l > 0) {
			minus += imos[b][l-1];
		}
		if(t > 0) {
			minus += imos[t-1][r];
		}
		return imos[b][r] - minus + plus;
	}
}

class Writer extends PrintWriter{
	public Writer(String filename)throws IOException
	{super(new BufferedWriter(new FileWriter(filename)));}
	public Writer()throws IOException{super(System.out);}
}
class ContestScanner implements Closeable{
	private BufferedReader in;private int c=-2;
	public ContestScanner()throws IOException 
	{in=new BufferedReader(new InputStreamReader(System.in));}
	public ContestScanner(String filename)throws IOException
	{in=new BufferedReader(new InputStreamReader(new FileInputStream(filename)));}
	public String nextToken()throws IOException {
		StringBuilder sb=new StringBuilder();
		while((c=in.read())!=-1&&Character.isWhitespace(c));
		while(c!=-1&&!Character.isWhitespace(c)){sb.append((char)c);c=in.read();}
		return sb.toString();
	}
	public String readLine()throws IOException{
		StringBuilder sb=new StringBuilder();if(c==-2)c=in.read();
		while(c!=-1&&c!='\n'&&c!='\r'){sb.append((char)c);c=in.read();}
		return sb.toString();
	}
	public long nextLong()throws IOException,NumberFormatException
	{return Long.parseLong(nextToken());}
	public int nextInt()throws NumberFormatException,IOException
	{return(int)nextLong();}
	public double nextDouble()throws NumberFormatException,IOException 
	{return Double.parseDouble(nextToken());}
	public void close() throws IOException {in.close();}
}