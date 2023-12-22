import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		long K = scan.nextLong();
		long result = 0;

		if(N<K) {
			result = N;
		}else if(N%K==0) {
			result = 0;
		}else {
			if(N-K*(N/K)<K*((N/K)+1)-N) {
				result = N-K*(N/K);
			}else {
				result = K*((N/K)+1)-N;
			}
		}
		System.out.println(result);
	}
}