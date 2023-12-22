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
		int A=sc.nextInt();
		int ans=0;
		while(H-A*ans>0)++ans;
		System.out.println(ans);
	}
}

// OpenJDK reference:
//   http://openjdk.java.net/

// Java language references:
//   http://docs.oracle.com/javase
