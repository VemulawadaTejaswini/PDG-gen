import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		List<Integer> num1Divisor = new ArrayList<>();
		List<Integer> num2Divisor = new ArrayList<>();
		List<Integer> commonDivisor = new ArrayList<>();

		for(int i = 1;i <= num1; i++) {
			if(num1 % i == 0) {
				num1Divisor.add(i);
			}
		}

		for(int i = 1;i <= num2; i++) {
			if(num2 % i == 0) {
				num2Divisor.add(i);
			}
		}

		for (Integer num : num1Divisor) {
			if(num2Divisor.contains(num)) {

				commonDivisor.add(num);
				for(int i = 2;i<num;i++) {
					if(num % i == 0)
						commonDivisor.remove(num);
				}

			}
		}

		System.out.println(commonDivisor.size());
	}


}
