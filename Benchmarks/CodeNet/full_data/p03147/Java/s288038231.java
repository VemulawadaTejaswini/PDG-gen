import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);static void p(int i) {System.out.println(i);}static void p(long i) {System.out.println(i);}static void p(String i) {System.out.println(i);}static void p(double i) {System.out.println(i);}
	
	
	public static void main(String[] args) {
		int N=sc.nextInt();
		
		int h[]=new int[N];
		
		for(int i=0;i<N;i++) {
			h[i]=sc.nextInt();
		}
		
		int ans=0;
		
		for(int i=1;i<=100;i++) {
			
			for(int a=0;a<N;a++) {
				
				if(h[a]>=i) {
					while(h[a]>=i) {
						a++;
						if(a==N) {
							break;
						}
					}
					ans++;
					
				}
				
				
				
				
			}
			
			
		}
		p(ans);
	}
	
}
	
