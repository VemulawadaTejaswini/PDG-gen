import java.io.*;
import java.util.*;

class Solver extends Main{
	Solver(long v, long w ,boolean[] used, int[][] items, int lim, long[] acc){
		knapsack(0,v,w,used,items,lim,acc);
	}
	void knapsack(int idx,long v, long w ,boolean[] used, int[][] items, int lim,long[] acc){
		if(idx<items.length){
			if(w+items[idx][0]<=lim){
				if(acc[0]<v+items[idx][1]) acc[0]=v+items[idx][1];
				knapsack(idx+1,v+items[idx][1],w+items[idx][0],used,items,lim,acc);
			}
			knapsack(idx+1,v,w,used,items,lim,acc);
		}
	}
}

class Main{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc=new Scanner(System.in);
		int[] prm=readlI(sc," ");
		int n=(int)prm[0];
		int w=prm[1];
		int[][] items=new int[n][2];
		for(int i=0; i<n; i++){
			items[i]=readlI(sc," ");
		}
		boolean[] used=new boolean[n];
		long[] acc=new long[1];
		tblSort(items);
		//for(int[] itm: items) puts(itm);
		acc[0]=0;
		new Solver(0,0,used,items,w,acc);
		puts(acc[0]);
	}	
	
	//utility
	static int[] readlI(Scanner sc, String dl){
		return Arrays.stream(sc.nextLine().trim().split(dl)).mapToInt(Integer::parseInt).toArray();
	}
	static int readI(Scanner sc){
		return Integer.parseInt(sc.nextLine().trim());
	}
	static String[] readlS(Scanner sc, String dl){
		return sc.nextLine().trim().split(dl);
	}
	static String resadS(Scanner sc){
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
