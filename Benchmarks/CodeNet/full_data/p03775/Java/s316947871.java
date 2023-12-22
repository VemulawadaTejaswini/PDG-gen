import java.math.BigInteger;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		
		double root_N = Math.sqrt((double)N);
		int root_N_kiriage;
		if((int)root_N==root_N){
			root_N_kiriage = (int)root_N;
		}else{
			root_N_kiriage = (int)root_N + 1;
		}
		//a<b
		int a = 1;
		int b = 1;
		for(int i = root_N_kiriage; i<=N; i++){
			if(N%i == 0){
				a = (int)(N/i);
				b =i;
				break;
			}
		}
		int b_keta = (int)Math.log10((double)b) + 1;
		System.out.println(b_keta);
		
	}

}
