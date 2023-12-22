import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//C
		int N = sc.nextInt();
		int K = sc.nextInt();
		long ans = N / K;
		long counter = 0;
		ans = ans*ans*ans;

		if(K % 2 == 0){
			for(int i = 1 ; i <= N ; i++){
				if(i%K == (K/2)){
					counter++;
				}
			}
			ans += counter * counter * counter;
		}

		System.out.println(ans);
	}
}
