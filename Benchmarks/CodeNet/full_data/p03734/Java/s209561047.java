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
		int m=prm[1];
		int[][] data=new int[n][2];
		for(int i=0; i<n; i++){
			data[i]=readlI(sc," ");
		}
		tblSort(data);
		int[][] items=new int[4][101];
		for(int i=0;i<4; i++){
			Arrays.fill(items[i],-1);
			items[i][0]=0;
		}
		int[] weight=new int[4];
		weight[0]=data[0][0];
		int idxi=0;
		int idxj=1;
		int ini=data[0][0];
		for(int i=0; i<data.length; i++){
			if(data[i][0]==ini){
				items[idxi][idxj]=items[idxi][idxj-1]+data[i][1];
				idxj+=1;
			}else if(data[i][0]!=ini){
				ini=data[i][0];
				idxi+=1;
				idxj=1;
				items[idxi][idxj]=items[idxi][idxj-1]+data[i][1];
				weight[idxi]=data[i][0];
				idxj+=1;
			}
		}
		//for(int[] itm: items) puts(itm);
		int a=0, b=0, c=0, d=0;
		long val=0;
		long wgt=0;
		long total=0;
		while(items[0][a]>-1){
			b=0;
			while(items[1][b]>-1){
				c=0;
				while(items[2][c]>-1){
					d=0;
					while(items[3][d]>-1){
						val=items[0][a]+items[1][b]+items[2][c]+items[3][d];
						wgt=weight[0]*a+weight[1]*b+weight[2]*c+weight[3]*d;
						if(wgt<=m){
							if(total<val) total=val;
						}
						d+=1;
					}
					c+=1;
				}
				b+=1;
			}
			a+=1;
		}
		puts(total);
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
