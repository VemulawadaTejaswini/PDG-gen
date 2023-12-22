import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class Solver extends Main{
	Solver(){
		
	}
}//Solver_end

@SuppressWarnings("unchecked")
class Main{
	static int imax=Integer.MAX_VALUE;
	static long lmax=Long.MAX_VALUE;
	
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner sc=new Scanner(System.in);
		int[] num=readlnI(sc," ");
		
		int[] a=new int[101];
		int[] b=new int[101];
		
		for(int i=num[0]; i<num[1]; i++){
			a[i]=1;
		}
		for(int i=num[2]; i<num[3]; i++){
			b[i]=1;
		}
		
		int c=0;
		for(int i=0; i<101; i++){
			if(a[i]==1 && b[i]==1){
				c++;
			}
		}
		
		puts(c);

	}//main_end
	
//---------------------------------------------------------------------------
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
	static int sum(int[] ary){
		int sum=0;
		for(int i=0; i<ary.length; i++) sum+=ary[i];
		return sum;
	}
	static long sum(long[] ary){
		long sum=0;
		for(int i=0; i<ary.length; i++) sum+=ary[i];
		return sum;
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
