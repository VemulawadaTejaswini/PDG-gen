import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//C
		int N = sc.nextInt();
		int K = sc.nextInt();
		long ans;
		long counter = 0;
		long counterEven = 0;

		for(int i = 1 ; i < N ; i++){
			if(i%K == 0){
				counter++;
			}
			if(i%K == (K/2)){
				counterEven++;
			}
		}
		ans = counter * counter * counter;

		if(N % 2 == 0){
			ans += counterEven * counterEven * counterEven;;
		}

		System.out.println(ans);
	}
}