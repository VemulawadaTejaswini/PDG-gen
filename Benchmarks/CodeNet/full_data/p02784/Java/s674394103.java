// This file is a "Hello, world!" in Java language by OpenJDK for wandbox.

import java.util.*;
import java.io.*;

class Main
{
	public static void main(String[] args){
		new Main().run();
	}
	
	void run(){
		Scanner sc=new Scanner(System.in);
		int H=sc.nextInt();
		int N=sc.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;++i)A[i]=sc.nextInt();
		for(int i=0;i<N;++i)H-=A[i];
		System.out.println(H<=0?"Yes":"No");
	}
}

// OpenJDK reference:
//   http://openjdk.java.net/

// Java language references:
//   http://docs.oracle.com/javase
