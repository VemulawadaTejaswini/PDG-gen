import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int prime[] = new int[500000];
		prime[0]=2;
		int idx=0;
		int num =3;
		while(prime[idx]<x) {
			for(int i=0;i<=idx;i++) {
				if(num%prime[i]==0)break;
				if(i==idx) {
					idx++;
					prime[idx]=num;
				}
			}
			num+=2;
		}
		print(""+prime[idx]);
	}
	
	private static int min(int a, int b) {
		return a<b?a:b;
	}
	
	private static Long min(Long a, Long b) {
		return a<b?a:b;
	}
	
	private static int max(int a, int b) {
		return a>b?a:b;
	}
	
	private static Long max(Long a, Long b) {
		return a>b?a:b;
	}
	
	private static void print(String s) {
		System.out.println(s);
	}

}
