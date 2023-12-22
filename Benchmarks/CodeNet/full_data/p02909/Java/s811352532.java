import java.util.Scanner;

public class NestedlfStatement1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();

		if(S.equals("Sunny")) {
			System.out.println("Coudy");
		}else if(S.equals("Cloudy")) {
			System.out.println("Rainy");
		}else {
			System.out.println("Sunny");
		}


	}

}
