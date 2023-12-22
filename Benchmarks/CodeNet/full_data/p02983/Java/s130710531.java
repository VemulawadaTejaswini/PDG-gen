import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long L = sc.nextLong();
		long R = sc.nextLong();
		int minmod = 2020;
		for(long i = L; i < R; i++) {
			for(long j = i + 1; j <= R; j++) {
				minmod = (int) Math.min(minmod, (i % 2019) * (j % 2019) % 2019);
				//System.out.println(i + " " + j + " " + minmod);
				if(R % 2019 == 0) {
					break;
				}
			}
		}
		System.out.println(minmod);
	}

}