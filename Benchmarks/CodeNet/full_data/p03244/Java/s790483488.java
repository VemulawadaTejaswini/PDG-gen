import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws Exception{
		FScanner sc=new FScanner();
		//Scanner sc=new Scanner(System.in);
		int n=sc.readInt();
		int[] num=sc.readIntL();
		
		int[] ac=new int[100001];
		int[] bc=new int[100001];
		
		for(int i=0; i<num.length; i+=2){
			ac[num[i]]+=1;
		}
		for(int i=1; i<num.length; i+=2){
			bc[num[i]]+=1;
		}
		
		int am=0;
		int ax=0;
		int bm=0;
		int bx=0;
		
		for(int i=0; i<ac.length; i++){
			if(am<ac[i]){
				am=ac[i];
				ax=i;
			}
		}
		for(int i=0; i<bc.length; i++){
			if(bm<bc[i]){
				bm=bc[i];
				bx=i;
			}
		}
		
		if(ax!=bx){
				System.out.println((n/2-am)+(n/2-bm));
		}else{
			if(am<bm){
				System.out.println((n/2-am)+(n/2));
			}else if(am>bm){
				System.out.println((n/2)+(n/2-bm));
			}else if(am==bm){
				System.out.println((n/2-am)+(n/2));
			}
		}
		
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
