import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] inputArr = sc.nextLine().split(" ");
		long a = Long.parseLong(inputArr[0]);
		long b = Long.parseLong(inputArr[1]);
		
		ArrayList<Long> divisorAList = new ArrayList<>();
		ArrayList<Long> divisorBList = new ArrayList<>();
		
		
		long dividedValue = a;
		for(long i = 2; i < a/2 && i <= dividedValue; i++) {
			if(dividedValue % i == 0 && i != a) {
				divisorAList.add(new Long(i));
				while(dividedValue % i == 0) {
					dividedValue /= i;
				}
			}
		}
		
		dividedValue = b;
		for(long i = 2; i < a/2 && i <= dividedValue; i++) {
			if(dividedValue % i == 0 && i != b) {
				divisorBList.add(new Long(i));
				while(dividedValue % i == 0) {
					dividedValue /= i;
				}
			}
		}
		
		int count = 1;// 1は絶対含む
		for(Long divisor : divisorAList) {
			if(divisorBList.contains(divisor)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
