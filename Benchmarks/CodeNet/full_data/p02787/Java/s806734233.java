import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	static BufferedReader reader;
	final static boolean MODE_DEBUG = true;
	//static field here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		String[] HN = readLine();
		int H = Integer.parseInt(HN[0]);
		int N = Integer.parseInt(HN[1]);
		int[] j = new int[N];
		int[] c = new int[N];
		for(int i=0;i<N;i++) {
			String[] st = readLine();
			j[i] = Integer.parseInt(st[0]);
			c[i] = Integer.parseInt(st[1]);
		}
		DPTable dpt = new DPTable(H+1,0,Integer.MAX_VALUE,true);
		print(dpt.calc(c,j));
		
		//String[] s = readLine();
		//print(num);
	}
	
	//functions here
	//note that all methods should be STATIC

	private static <T> int arraySearch(T needle, T[] heystack) {
		for(int i=0;i<heystack.length;i++) {
			if(needle.equals(heystack[i])) {
				return i;
			}
		}
		return -1;
	}
	private static String[] readLine(){
		try{
			return reader.readLine().split(" ");
		}catch(Exception e){
			e.printStackTrace();
			return new String[]{e.getMessage()};
		}
	}
	private static int[] readLineInt(){
		try{
			String[] s = readLine();
			int[] ints = new int[s.length];
			for(int i=0;i<ints.length;i++) {
				ints[i] = Integer.parseInt(s[i]);
			}
			return ints;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	private static byte[] readLineByte(){
		try{
			String[] s = readLine();
			byte[] bytes = new byte[s.length];
			for(int i=0;i<bytes.length;i++) {
				bytes[i] = Byte.parseByte(s[i]);
			}
			return bytes;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	private static char[] readLineChar(){
		try{
			String[] s = readLine();
			char[] chars = new char[s.length];
			for(int i=0;i<chars.length;i++) {
				chars[i] = (char)Integer.parseInt(s[i]);
			}
			return chars;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	private static void print(Object o){
		System.out.println(o);
	}
	private static void print(){
		System.out.println();
	}
	private static void printd(Object o){
		if(MODE_DEBUG)System.err.println(o);
	}
	private static void printd(){
		if(MODE_DEBUG)System.err.println();
	}
}

class DPTable{
	int N;//length
	int[] a;//data
	boolean use_repeat;
	
	public DPTable(int N, int init_0, int init_other, boolean use_repeat){
		// TODO 自動生成されたコンストラクター・スタブ
		this.N = N;
		this.a = new int[N];
		Arrays.fill(a,init_other);
		a[0] = init_0;
		this.use_repeat = use_repeat;
	}
	
	public int calc(int[] cost, int[] jump) {
		for(int i=0;i<cost.length;i++) {
			int c = cost[i];
			for(int n=1;n<N;n++) {
				int from = Math.max(0,n-jump[i]);
				if(a[from]+c<a[n]) {a[n]=a[from]+c;}
			}
		}
		return a[N-1];
	}
	
	public String emitData() {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			sb.append(i+"\t"+a[i]+"\n");
		}
		return sb.toString().trim();
	}
}

class DPTable_D{
	int N;//length
	double[] a;//data
	boolean use_repeat;
	
	public DPTable_D(int N,double init_0, double init_other, boolean use_repeat){
		// TODO 自動生成されたコンストラクター・スタブ
		this.N = N;
		this.a = new double[N];
		Arrays.fill(a,init_other);
		a[0] = init_0;
		this.use_repeat = use_repeat;
	}
	
	public double calc(double[] cost, int[] jump) {
		for(int i=0;i<cost.length;i++) {
			double c = cost[i];
			for(int n=1;n<N;n++) {
				int from = Math.max(0,n-jump[i]);
				if(a[from]+c<a[n]) {a[n]=a[from]+c;}
			}
		}
		return a[N-1];
	}
	
	public String emitData() {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			sb.append(i+"\t"+a[i]+"\n");
		}
		return sb.toString().trim();
	}
