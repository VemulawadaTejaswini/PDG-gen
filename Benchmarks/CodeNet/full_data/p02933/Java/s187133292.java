/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Main{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = sc.nextLine();
		if(a < 3200) {
		    System.out.println("red");
		} else System.out.println(s);
	}
}