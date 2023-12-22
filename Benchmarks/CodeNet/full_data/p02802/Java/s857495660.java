import java.util.*;
import java.io.*;

// This file is a "Hello, world!" in Java language by OpenJDK for wandbox.

class Main
{
	public static void main(String[] args)
	{
		new Main().run();
	}

	void run(){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		boolean[] AC=new boolean[N];
		int[] WA=new int[N];
		for(int i=0;i<M;++i){
			int p=sc.nextInt();
			--p;
			String s=sc.next();
			if(s.equals("AC")){
				AC[p]=true;
			}else{
				if(!AC[p])++WA[p];
			}
		}
		int ok=0;int ng=0;
		for(int i=0;i<AC.length;++i){
			if(AC[i]){
				++ok;
				ng+=WA[i];
			}
		}
		System.out.println(ok+" "+ng);
	}
	
	void tr(Object...o){System.out.println(Arrays.deepToString(o));}
}
// OpenJDK reference:
//   http://openjdk.java.net/

// Java language references:
//   http://docs.oracle.com/javase
	