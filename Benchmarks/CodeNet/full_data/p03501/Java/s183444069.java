import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int hour;
		int priceA;
		int priceB;
		
		Scanner sn = new Scanner(System.in);
		hour = sn.nextInt();
		priceA = sn.nextInt();
		priceB = sn.nextInt();
		sn.close();
		
		int result;
		result = hour * priceA;
		
		if(result > priceB){
			System.out.println(priceB);
		}else {
			System.out.println(result);
		}
	}
}