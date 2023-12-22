 package main;
 
 import java.util.*;
 import java.math.*;
 public class A
 {
 	public static void main (String[] args)
 	{
 		Scanner in = new Scanner(System.in);
 		int n = in.nextInt();
 		boolean layers[] = new boolean[100];
 		int res = 0; 
 		Arrays.fill(layers, false);
 		for (int i = 0; i < n; ++i)
 		{
 			int a = in.nextInt();
 			if(layers[a] == false)
 			{
 				res += 1;
 				layers[a] = true;
 			}
 		}
 		System.out.println(res);
 	}
 }

