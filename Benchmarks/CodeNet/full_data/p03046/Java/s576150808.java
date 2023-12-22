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
		if(K==0){
			PrintWriter pw=new PrintWriter(System.out);
			for(int i=0;i<(1<<M);++i){
				pw.print(i + " " + i + (i==((2<<M)-1)?"\n":" "));
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
