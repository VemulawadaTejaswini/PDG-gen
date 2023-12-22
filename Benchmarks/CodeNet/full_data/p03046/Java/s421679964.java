import java.util.*;
import java.math.*;
import java.io.*;

class Main
{
	public static void main(String[] args)
	{
		new Main().run();
	}
	
	void run(){
		Scanner sc=new Scanner(System.in);
		int M=sc.nextInt();
		long K=sc.nextLong();
		//00,
		//11,10,00,01,00,10,11,01
		if(M==0){
			if(K==0){
				System.out.println("0 0");
			}else{
				System.out.println(-1);
			}
		}else if(M==1){
			if(K==0){
				System.out.println("0 0 1 1");	
			}else{
				System.out.println(-1);
			}
		}else if((1<<M)-1>=K){
			PrintWriter pw=new PrintWriter(System.out);
			ArrayList<Long> a=new ArrayList<>();
			for(long i=0;i<(1<<M);++i){
				if(i!=K)a.add(i);
			}
			a.add(K);
			for(long i=(1<<M)-1;i>=0;--i){
				if(i!=K)a.add(i);
			}
			a.add(K);
			for(int i=0;i<a.size();++i){
				pw.print(a.get(i)+(i==a.size()-1?"\n":" "));
			}
			pw.close();
		}else{
			System.out.println("-1");
		}
		
	}
	
	
	void tr(Object...objects){
		System.out.println(Arrays.deepToString(objects));
	}
}
