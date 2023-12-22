import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		sc.close();
		System.out.println(S);
		String[] arrInput = S.split(" ");
		
		int hourValue = Integer.parseInt(arrInput[0]) * Integer.parseInt(arrInput[1]);
		int maxValue = Integer.parseInt(arrInput[2]);
		
		System.out.println(hourValue > maxValue ? maxValue: hourValue);

	}

}