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
		char c=sc.next().toCharArray()[0];
		System.out.println((char)(c+1));
	}
	
	void tr(Object...o){System.out.println(Arrays.deepToString(o));}
}
// OpenJDK reference:
//   http://openjdk.java.net/

// Java language references:
//   http://docs.oracle.com/javase
	