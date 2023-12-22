import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int D = 0;
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int c[];
		c = new int[100000];
		
		for(int i = 0; i<N; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			c[a-1] = c[a-1] + b;			
		}
		

		
		for(int j = 0;K>0;j++){
			D = j + 1;
			K = K - c[j];
		}
		
		System.out.println(D);	
	}
}