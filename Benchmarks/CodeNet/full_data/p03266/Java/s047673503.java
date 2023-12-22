import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int zero_K = 0, half_K = 0;
		for(int i = 1; i <= N; i++) {
			if(i % K == 0) zero_K++;
			if(i % K == K / 2) half_K++;
		}
		if(K % 2 == 0) {
			System.out.println(zero_K * zero_K * zero_K + half_K * half_K * half_K);
		}
		else {
			System.out.println(zero_K * zero_K * zero_K);
		}
	}
}
