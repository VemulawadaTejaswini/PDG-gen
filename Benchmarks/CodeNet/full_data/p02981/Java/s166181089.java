import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long L = scan.nextLong();
		long R = scan.nextLong();
		
		long min = Long.MAX_VALUE;
		
		for(long i = L; i < R; i++) {
			for(long j = i + 1; j <= R; j++) {
				long im = i % 2019;
				long jm = j % 2019;
				if(min > im * jm) {
					min = im * jm;
				}
			}
		}
		
		System.out.println(min);
		scan.close();
	}

}