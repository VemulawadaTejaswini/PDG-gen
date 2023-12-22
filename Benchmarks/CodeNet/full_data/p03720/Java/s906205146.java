import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class Solver extends Main{
	Solver(){

	}
}

class Main{
	int imax=Integer.MAX_VALUE;
	long lmax=Long.MAX_VALUE;
	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc=new Scanner(System.in);
		int[] num=readlnI(sc," ");
		int[] adj=new int[num[0]];
		int[] data=new int[2];
		for(int i=0; i<num[1]; i++){
			data=readlnI(sc," ");
			adj[data[0]-1]+=1;
			adj[data[1]-1]+=1;
		}
		for(int a: adj) puts(a);
	}	
	
	//utility
	static int[] readlnI(Scanner sc, String dl){
		return Arrays.stream(sc.nextLine().trim().split(dl)).mapToInt(Integer::parseInt).toArray();
	}
	static long[] readlnL(Scanner sc, String dl){
		return Arrays.stream(sc.nextLine().trim().split(dl)).mapToLong(Long::parseLong).toArray();
	}
	static int readI(Scanner sc){
		return Integer.parseInt(sc.nextLine().trim());
	}
	static String[] readS(Scanner sc, String dl){
		return sc.nextLine().trim().split(dl);
	}
	static String nextS(Scanner sc){
		return sc.nextLine().trim();
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
