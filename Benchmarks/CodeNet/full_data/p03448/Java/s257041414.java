import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfFiveHundredYen = sc.nextInt();
		int numberOfOneHundredYen = sc.nextInt();
		int numberOfFiftyYen = sc.nextInt();
		int fee = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i <= numberOfFiveHundredYen; i++) {
			for(int j=0; j<= numberOfOneHundredYen; j++) {
				for(int k=0; k <= numberOfFiftyYen; k++){
					int amountOfPay = 500 * i + 100 * j + 50 * k;
					if(amountOfPay == fee) {
						count++;
					}
				}
			}
		}
		
		System.out.println(count); 

		
	}
}