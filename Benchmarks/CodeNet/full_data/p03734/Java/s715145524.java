import java.io.*;
import java.util.*;

class Solver extends Main{
	Solver(){

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
		long[][] dp=new long[n+1][(int)w+1];
		dp[0][0]=1;
		for(int i=0; i<n; i++){
			for(int j=0; j<w+1; j++){
				if(dp[i][j]>0){
					if(j+items[i][0]<=w && dp[i+1][j+(int)items[i][0]]<dp[i][j]+items[i][1]){
						dp[i+1][j+(int)items[i][0]]=dp[i][j]+items[i][1];
					}
					dp[i+1][j]=dp[i][j];
				}
			}
		}
		int l=w;
		while(l>0 && dp[n][l]==0){
			l-=1;
		}
		puts(dp[n][l]-1);
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
					return a[1]-b[1];
				}else{
					return a[0]-b[0];
				}
			}
		});
	}
}




