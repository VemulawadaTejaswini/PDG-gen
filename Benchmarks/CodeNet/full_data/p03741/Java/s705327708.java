import java.io.*;
import java.util.*;

class Exec extends Main{
	void solve(){
	}
}

class Main{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc=new Scanner(System.in);
		Exec exe=new Exec();
		int n=readI(sc);
		int[] num=readsI(sc," ");
		int s=num[0];
		int c=1000000;
		int r=0;
		if(s!=0){
			r=calc(s,num);
			if(r<c) c=r;
		}else{
			s=-1;
			r=calc(s,num);
			if(r<c) c=r;
			s=1;
			r=calc(s,num);
			if(r<c) c=r;
		}
		
		puts(c);
	}

	static int calc(int s, int[] num){
		int c=0;
		int a,b;
		for(int i=1; i<num.length; i++){
			a=num[i];
			b=s+a;
			if(s<0){ //-1
				if(b>=1){
					s=b;
				}else if(b<1){
					s=1;
					c+=Math.abs(b)+1;
				}
			}else if(s>0){ //+1
				if(b<=-1){
					s=b;
				}else if(b>-1){
					s=-1;
					c+=b+1;
				}
			}
		}
		return c;
	}
	
	
	
	
	
	
	
	
	//utility
	static int[] readsI(Scanner sc, String dl){
		return Arrays.stream(sc.nextLine().trim().split(dl)).mapToInt(Integer::parseInt).toArray();
	}
	static String[] readsS(Scanner sc, String dl){
		return sc.nextLine().trim().split(dl);
	}
	static int readI(Scanner sc){
		return Integer.parseInt(sc.nextLine().trim());
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
