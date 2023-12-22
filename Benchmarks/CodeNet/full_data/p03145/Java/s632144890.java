
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// get a integer
		int fare1 = sc.nextInt();
		int fare2 = sc.nextInt();
		
		int total = getTotalPrice(fare1,fare2);
		
		System.out.println(total);
	}
	
	public static boolean isMaxFare(int fare) {
		return fare > 100 ? true : false;
	}
	
	public static boolean isOddNumber(int fare) {
		System.out.println(fare % 2 );
		return (fare % 2 ) == 0 ? true : false;
	}
	
	public static int getTotalPrice(int fare1,int fare2) {
		
		if(isMaxFare(fare1) || isMaxFare(fare2)) {
			return 0;
		}
		
		if(!isOddNumber(fare1) || !isOddNumber(fare2)) {
			return 0;
		}
		
		return fare1 + (fare2 / 2); 
	}
	
}
