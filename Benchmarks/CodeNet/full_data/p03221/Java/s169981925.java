import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws Exception{
		FScanner sc=new FScanner();
		int[] num=sc.readIntL();
		int[][] dat=new int[num[1]][2];
		int[] buf=new int[2];
		Map<Integer,List<Integer>> country=new HashMap<>();
		int[] ans=new int[num[1]];
		for(int i=0; i<num[1]; i++){
			buf=sc.readIntL();
			dat[i][0]=buf[0];
			dat[i][1]=buf[1];
			if(country.containsKey(dat[i][0])){
				country.get(dat[i][0]).add(dat[i][1]);
			}else{
				country.put(dat[i][0],new ArrayList<>());
				country.get(dat[i][0]).add(dat[i][1]);
			}
		}
		
		for(int key: country.keySet()){
			Collections.sort(country.get(key));
			//System.out.println(country.get(key));
		}
		
		for(int i=0; i<dat.length; i++){
			int l=country.get(dat[i][0]).size();
			int r=0;
			for(int j=0; j<l; j++){
				if(dat[i][1]==country.get(dat[i][0]).get(j)){
					r=j;
				}
			}
			ans[i]=r;
			int city=1000000;
			int rank=1000000;
			city+=dat[i][0];
			rank+=r+1;
			System.out.printf("%s%s\n",String.valueOf(city).substring(1,7),String.valueOf(rank).substring(1,7));
		}
	}

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
		
		double[] readDoubleL(){
			String[] buf=sc.nextLine().split(" ");
			double[] num=new double[buf.length];
			for(int i=0; i<buf.length; i++){
				num[i]=Double.parseDouble(buf[i]);
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
