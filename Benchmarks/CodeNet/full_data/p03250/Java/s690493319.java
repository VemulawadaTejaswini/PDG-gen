import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);static void p(int i) {System.out.println(i);}static void p(long i) {System.out.println(i);}static void p(String i) {System.out.println(i);}static void p(double i) {System.out.println(i);}
	
	//a 97 || 
	public static void main(String[] args) {
		//int N=sc.nextInt();
		//String S=sc.next();
		//for(int i=0;i<N;i++) {}
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		
		
		
		p(Math.max(A+B*10+C, Math.max(A*10+B+C, C*10+B+A)));
	}
	
}
	
