import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] W = new int[N];
		for(int i=0; i<N; i++) {
			W[i] = sc.nextInt();
		}
		
		int min = 20000;
		for(int i=0; i<N; i++) {
			int t =Math.abs(calcsum1(W,i) - calcsum2(W,i));
			if(t<min) {min = t;}
		}
		System.out.println(min);
		
		sc.close();
		
	}
	
	static int calcsum1(int[] W,int t) {
		int sum = 0;
		for(int i=0;i<=t; i++) {
			sum += W[i];
		}
		return sum;
	}
	
	static int calcsum2(int[] W,int t) {
		int sum = 0;
		for(int i=t+1;i<=W.length-1; i++) {
			sum += W[i];
		}
		return sum;
	}
	
	

}