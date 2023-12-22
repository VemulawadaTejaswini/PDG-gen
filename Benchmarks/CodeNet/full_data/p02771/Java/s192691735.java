/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

public class Solution {
	public static void main (String[] args) {
// 		System.out.println("GfG!")
Scanner sc =new Scanner(System.in);
int a=sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
if((a==b &&c!=b)|| (a==c && b!=c) || (b==c && b!=a))
System.out.println("Yes");
else
System.out.println("No");
	}
}