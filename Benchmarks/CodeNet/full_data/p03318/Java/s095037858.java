

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long k = in.nextLong();
		if(k<=9) {
			for(int i=1;i<=k;i++) {
				System.out.println(i);
			}
		}else if(k<=18) {
			printDigit1();
			for(int i=10;i<=k;i++) {
				System.out.println(10*(i-9)+9);
			}
		}else {
			printDigit1();
			printDigit2();
			long target = 109;
			long prevTargetDigit = 3;
			for(long i=19;i<=k;i++) {
				while(true) {
					if(prevTargetDigit!=getDigit(target)) {
						target = (long) Math.pow(10, getDigit(target)-1) + (long) Math.pow(10, getDigit(target)-getDigit(getDigitSum(target))) -1;
						prevTargetDigit = getDigit(target);
					}
					boolean found = false;
					long test = target + (long) Math.pow(10, getDigit(target)-getDigit(getDigitSum(target)));
					long limit = (1+getFirstNumber(target))*(long) Math.pow(10, getDigit(target)-1);
					while(!found && test<limit) {
						if((double)target/getDigitSum(target) > (double)test/getDigitSum(test)) {
							found = true;
							break;
						}
						test += (long) Math.pow(10, getDigit(target)-getDigit(getDigitSum(target)));
					}
					if(found) {
						target += (long) Math.pow(10, getDigit(target)-getDigit(getDigitSum(target)));
					}else {
						System.out.println(target);
						target += (long) Math.pow(10, getDigit(target)-getDigit(getDigitSum(target)));
						break;
					}
				}
			}
		}
	}
	
	public static void printDigit1() {
		for(int i=1;i<10;i++) {
			System.out.println(i);
		}
	}
	
	public static void printDigit2() {
		for(int i=1;i<10;i++) {
			System.out.println(10*i+9);
		}
	}
	
	public static long getDigitSum(long num) {
		long sum = 0;
		while(num>0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
	
	public static long getDigit(long num) {
		long digit = 0;
		while(num>0) {
			digit++;
			num /= 10;
		}
		return digit;
	}
	
	public static long getFirstNumber(long num) {
		while(num>=10) {
			num /= 10;
		}
		return num;
	}

}
