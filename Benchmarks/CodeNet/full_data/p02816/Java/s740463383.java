// This file is a "Hello, world!" in Java language by OpenJDK for wandbox.
import java.util.*;
import java.io.*;

class Main
{
	public static void main(String[] args)
	{
		new Main().run();
	}
	
	void run(){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] A=new int[N];
		int[] A_diff=new int[2*N-1];
		int[] B=new int[N];
		int[] B_diff=new int[N];
		for(int i=0;i<N;++i)A[i]=sc.nextInt();
		for(int i=0;i<N;++i)B[i]=sc.nextInt();
		for(int i=0;i<N;++i)A_diff[i]=A[i]^A[(i+1)%N];
		for(int i=0;i<N;++i)B_diff[i]=B[i]^B[(i+1)%N];
		for(int i=0;i<N-1;++i)A_diff[i+N]=A_diff[i];
		boolean[] search=search(A_diff,B_diff);
		int ans=0;
		PrintWriter pw=new PrintWriter(System.out);
		for(int i=0;i<N;++i){
			if(search[i]){
				pw.println(i+" " +(B[0]^A[i]));
			}
		}
		pw.close();
	}
	
	boolean[] search(int[] a,int[] b){
		int[] border=border(b);
		boolean[] ret=new boolean[a.length];
		int s=0,t=0,match=0;
		for(int i=0;i<a.length;++i){
			while(match>=0&&(match>=b.length||b[match]!=a[i]))match=(match==0?-1:border[match-1]);
			++match;
			if(match==b.length){ret[i-match+1]=true;}
		}
		return ret;
	}
	
	int[] border(int[] b){
		int n=b.length;
		int[] pat=new int[n];
		int match=0;
		for(int i=1;i<n;++i){
			while(match>=0&&b[i]!=b[match])
				match=(match==0?-1:pat[match-1]);
			++match;
			pat[i]=match;
		}
		return pat;
	}
	
	void tr(Object...o){System.out.println(Arrays.deepToString(o));}
}

// OpenJDK reference:
//   http://openjdk.java.net/

// Java language references:
//   http://docs.oracle.com/javase
