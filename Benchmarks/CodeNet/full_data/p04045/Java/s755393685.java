import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int number = sc.nextInt();
		boolean [] discard = new boolean[10];
 		for(int i = 0; i < number; i ++) {
			discard[sc.nextInt()] = true; 			
		}

		int result = 0;
		int remain = 0;
		int base = 1;
		while(amount != 0 || remain != 0) {
			int digit = amount % 10 + remain;
			int upDigit = digit + 9;
			while((digit <= upDigit) && discard[digit % 10]) digit ++;
			remain = digit / 10;
			digit = digit % 10;
			result += digit * base;
			base *= 10;
			amount /= 10;
		}
		System.out.println(result);
	}
}