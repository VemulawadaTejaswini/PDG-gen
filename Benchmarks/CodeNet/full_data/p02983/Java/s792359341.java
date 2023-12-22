import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long R = sc.nextLong();
		long L = sc.nextLong();
		
		long min = Long.MAX_VALUE;
		
		if(L - R > 2019) {
			min = 0;
		} else {
			for(long i = R; i < L; i++) {
				for(long j = L; j > i; j--) {
					min = Math.min(i* j % 2019, min);
				}
			}
		}
		
		
		System.out.println(min);
		sc.close();
	}

}
