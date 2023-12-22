import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long L = sc.nextLong();
		long R = sc.nextLong();
		
		
		long min1 = 2018;
		long min2 = 2018;
		for(long i= L; i <= R; i++) {
			if(min1 == 1 && min2 == 1)break;
			long num = i % 2019;
			if(num <= min1) {
				min2 = min1;
				min1 = num;
			} else if (num < min2){
				min2 = num;
			} else {
				continue;
			}
		}
		
		System.out.println((min1 * min2) % 2019);
	}

}
