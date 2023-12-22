/*package whatever //do not write package name here */

import java.io.*;

import java.util.*;
public class Main{
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
	long n=s.nextLong();
	long k=s.nextLong();
	System.out.println(Math.min((n%k),Math.abs(k-(n%k))));
	}
}