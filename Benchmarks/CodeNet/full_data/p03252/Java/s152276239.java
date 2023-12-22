import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws Exception{
		FScanner sc=new FScanner();
		//Scanner sc=new Scanner(System.in);
		String[] s=sc.readStringL("");
		String[] t=sc.readStringL("");
		
		int[] cs=new int[123];
		int[] ct=new int[123];
		for(String c: s){
			cs[c.getBytes("US-ASCII")[0]]+=1;
		}
		for(String c: t){
			ct[c.getBytes("US-ASCII")[0]]+=1;
		}
		Arrays.sort(cs);
		Arrays.sort(ct);
		
		
		boolean slv=true;
		for(int i=0; i<cs.length; i++){
			if(cs[i]!=ct[i]){
				slv=false;
			}
		}
		
		System.out.println((slv==true)? "Yes": "No");
	}
	
	static void solve(int cur, int nx, int en, int hld){}

	static void disp(int[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
		}
			System.out.println();
	}
	
	static void disp(String[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%s ",data[i]);
		}
			System.out.println();
	}
	
	static void disp(long[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
		}
			System.out.println();
	}
	
	static class FScanner{
		BufferedReader read=null;
		StringTokenizer tok=null;
		Scanner sc;
		FScanner() throws FileNotFoundException{
			sc=new Scanner(System.in);
		}
		boolean hasNextLine(){
			boolean has=true;
			if(!sc.hasNextLine()){
				has=false;
			}
			return has;
		}
		int readInt(){
			String buf=sc.nextLine();
			return Integer.parseInt(buf);
		}
		long readLong(){
			long i=Long.parseLong(sc.nextLine());
			return i;
		}
		int[] readIntL(){
			String[] buf=sc.nextLine().split(" ");
			int[] num=new int[buf.length];
			for(int i=0; i<buf.length; i++){
				num[i]=Integer.parseInt(buf[i]);
			}
			return num;
		}
		
		String readString(){
			return sc.nextLine();
		}
		String[] readStringL(String dlm){
			String[] s=sc.nextLine().split(dlm);
			return s;
		}
	}
}
