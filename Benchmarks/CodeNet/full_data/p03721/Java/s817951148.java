import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		long long int D = 0;
		long long int N = sc.nextlong long int();
		long long int K = sc.nextlong long int();
		
		long long int c[] = new long long int[100000];
		

		for(long long int i = 0; i<N; i++){
			long long int a = sc.nextlong long int();
			long long int b = sc.nextlong long int();
			
			c[a-1] = c[a-1] + b;			
		}
		

		long long int j = 0;
		
		while(K>0){
			D = j + 1;
			K = K - c[j];
			j++;
		}
		
		System.out.prlong long intln(D);
	}
}
