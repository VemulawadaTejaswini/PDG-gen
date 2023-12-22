import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long L = sc.nextLong();
		long R = sc.nextLong();

		long min = Long.MAX_VALUE;

		L = L % 2019;
		R = R % 2019;
		if (L > R) {
			long tmp = L;
			L = R;
			R = tmp;
		} else if (L == R){
			min = 0;
		} else if (L == 0 || R == 0){
			min = 0;
		}

		for (long i=L; i<R; i++){
			for (long j=i+1; j<=R; j++){
				min = Math.min(min, ((i * j) % 2019));
			}
		}
		if (min ==  Long.MAX_VALUE){
			min = 0;
		}
		System.out.println(min);
	}


}