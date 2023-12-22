import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class Solver extends Main{
	int cnv(String[] st,String ch){
		Boolean upd=false;
		String[] cpy=new String[st.length-1];
		int cnt=0;
		
		for(int i=0; i<st.length; i++){
			if(!st[i].equals(ch)){
				upd=true;
			}
		}
		
		while(upd==true){
			upd=false;
			cpy=new String[st.length-1];
			
			for(int i=0; i<st.length-1; i++){
				if(st[i+1].equals(ch)){
					cpy[i]=ch;
				}else{
					cpy[i]=st[i];
				}
			}
			st=cpy;
			for(int j=0; j<st.length; j++){
				if(!st[j].equals(ch)){
					upd=true;
				}
			}
			cnt++;
		}
		return cnt;
	}
}//Solver_end

class Main{
	static int imax=Integer.MAX_VALUE;
	static long lmax=Long.MAX_VALUE;
	
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner sc=new Scanner(System.in);
		String[] st=readlnS(sc,"");
		List<String> chr=new LinkedList<String>();
		int mn=imax;
		int x=0;
		
		for(int i=0;i<st.length; i++){
			if(chr.contains(st[i])==false){
				chr.add(st[i]);
			}
		}
		
		for(int i=0;i<chr.size(); i++){
			Solver slv=new Solver();
			x=slv.cnv(st,chr.get(i));
			if(mn>x) mn=x;
		}
		
		puts(mn);
		
	}//main_end
	
	//utility
	static int readI(Scanner sc){
		return Integer.parseInt(sc.nextLine().trim());
	}
	static long readL(Scanner sc){
		return Long.parseLong(sc.nextLine().trim());
	}
	static String readS(Scanner sc){
		return sc.nextLine().trim();
	}
	static int[] readlnI(Scanner sc, String dl){
		return Arrays.stream(sc.nextLine().trim().split(dl)).mapToInt(Integer::parseInt).toArray();
	}
	static long[] readlnL(Scanner sc, String dl){
		return Arrays.stream(sc.nextLine().trim().split(dl)).mapToLong(Long::parseLong).toArray();
	}
	static String[] readlnS(Scanner sc, String dl){
		return sc.nextLine().trim().split(dl);
	}
	@SuppressWarnings("unchecked")
	static <T> void puts(T... args){
		for(int i=0; i<args.length-1; i++){
			System.out.printf("%s ",args[i]);
		}
		System.out.println(args[args.length-1]);
	}
	static void puts(int[] ary){
		for(int i=0; i<ary.length-1; i++){
			System.out.printf("%d ",ary[i]);
		}
		System.out.println(ary[ary.length-1]);
	}
	static void puts(long[] ary){
		for(int i=0; i<ary.length-1; i++){
			System.out.printf("%d ",ary[i]);
		}
		System.out.println(ary[ary.length-1]);
	}
	static void bs(){
		System.out.println("");
	}
	static void tblSort(int[][] tbl){
		Arrays.sort(tbl, new Comparator<int[]>(){
			@Override
			public int compare(int[] a, int[] b){
				if(a[0]==b[0]){
					return b[1]-a[1];
				}else{
					return b[0]-a[0];
				}
			}
		});
	}
}
