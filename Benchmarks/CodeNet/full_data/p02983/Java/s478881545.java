import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long L = sc.nextLong();
		long R = sc.nextLong();
		
		long L2019 = L%2019;
		long R2019 = R%2019;
		
		if(L2019 >= R2019)R2019 += 2019;
		
		
		long min1 = 2018;
		long min2 = 2018;
		for(long i= L2019; i <= R2019; i++) {
			if(min1 == 0)break;
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
