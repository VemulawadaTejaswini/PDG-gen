import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws Exception{
		FScanner sc=new FScanner();
		int[] arg=sc.readIntL();
		int n=arg[0];
		int t=arg[1];
		
		int[][] path=new int[n][2];
		int[] buf=new int[2];
		for(int i=0; i<n; i++){
			buf=sc.readIntL();
			path[i][0]=buf[0];
			path[i][1]=buf[1];
		}
		
		int mx=1001;
		
		for(int i=0; i<n; i++){
			if(path[i][0]<mx && path[i][1]<=t){
				mx=path[i][0];
			}
		}
		System.out.println((mx==1001)? "TLE": mx);
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
