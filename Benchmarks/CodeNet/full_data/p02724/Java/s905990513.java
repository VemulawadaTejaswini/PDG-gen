/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int res=0;
	    res = res + 1000*(a/500);
	    a = a % 500;
	    res = res + 5*(a/5);
		System.out.println(res);
	}
}