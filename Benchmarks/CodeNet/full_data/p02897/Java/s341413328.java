/*
	submission # - User: herp_sy
	https://atcoder.jp/contests/

	coding: utf-8
	lang: Java8 (OpenJDK 1.8.0)
*/

import java.util.*;
import java.util.Collections; // sorting use
import java.io.*;
import static java.lang.System.*;

public class Main{
	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
      
		n = sc.nextInt();
		out.printf("%.8f",(double)(n - n / 2) / (double)n);
	}
}
