import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		
		int num = 0;
		int numberOfLunlun = 0;
		
		do {
			num++;
			if(checkLunlun(num)) numberOfLunlun++;
			if(k == numberOfLunlun) {
				System.out.println(num);
				return;
			}
		}while(true);
	}
	
	static int checkDigit(int n) {
		int num = 0;
		do {
			n /= 10;
			num++;
		}while(n != 0);
		return num;
	}
	
	static int[] disassembleDigit(int n) {
		int digitNumber = checkDigit(n);
		int[] digit = new int[digitNumber];
		for(int i = 0; i < digitNumber; i++) {
			digit[i] = n%10;
			n /= 10;
		}
		return digit;
	}
	
	static boolean checkLunlun(int n) {
		int[] digit = disassembleDigit(n);
		int digitNumber = checkDigit(n);
		
		if(digitNumber == 1) return true;
		
		for(int i = 0; i < digitNumber-1; i++) 
			if(Math.abs(digit[i]-digit[i+1]) > 1) return false; 
		
		return true;
	}
}
