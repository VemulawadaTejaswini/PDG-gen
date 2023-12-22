import java.io.*;
import java.util.*;

class Solve extends Main{
	void run(){
	}
}

class Main{
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner sc=new Scanner(System.in);
		int n=readI(sc);
		int[] line=readsI(sc," ");
		int[] x=new int[line.length+1];
		x[0]=-1;
		for(int i=0; i<line.length; i++){
			x[i+1]=line[i];
		}		
		int flg=0;
		int cnt=0;
		int p=0, c=0;
		
		for(int i=1; i<x.length; i++){
			p=x[i-1];
			c=x[i];
			if(flg==0){
				if(p<c){
					cnt+=1;
					flg=1;
				}
			}else if(flg==1){
					if(p>c){
						cnt+=1;
						flg=0;
					}
			}
		}
		puts(cnt);
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

}