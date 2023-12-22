import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);static void p(int i) {System.out.println(i);}static void p(long i) {System.out.println(i);}static void p(String i) {System.out.println(i);}static void p(double i) {System.out.println(i);}
	
	
	public static void main(String[] args) {
		
		int N=sc.nextInt();
		int M=sc.nextInt();
		
		int x[]=new int[M];
		for(int i=0;i<M;i++) {
			x[i]=sc.nextInt();
		}
		Arrays.sort(x);
		
	
		
		int t[]=new int[M-1];
		for(int i=1;i<M;i++) {
			t[i-1]=x[i]-x[i-1];
		}
		Arrays.sort(t);
		
		int ans=0;
		for(int i=0;i<M-N;i++) {
			ans+=t[i];
		}
		if(M<=N)ans=0;
		
		p(ans);
		
	}
	
}
	
