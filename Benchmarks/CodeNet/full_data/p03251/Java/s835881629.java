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
		int N=sc.nextInt();
		int M=sc.nextInt();
		int X=sc.nextInt();
		int Y=sc.nextInt();
		
		int maxX=-10000009;
		int minY=10000009;
		for(int i=0;i<N;i++) {
			int t=sc.nextInt();
			maxX=Math.max(t, maxX);
		}
		for(int i=0;i<M;i++) {
			int t=sc.nextInt();
			minY=Math.min(minY, t);
		}
		boolean x=false;
		//p(maxX+" "+minY);
		for(int i=X+1;i<=Y;i++) {
			if(i>maxX&&i<=minY) {
				x=true;
			}
		}
		if(!x)p("War");
		else p("No War");
	}
	
}
	
