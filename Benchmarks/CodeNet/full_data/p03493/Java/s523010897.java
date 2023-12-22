import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		String str = sc.next();
		int count = 0;

		if (str.substring(0,1).contentEquals("1")) count+=1;
		if (str.substring(1,2).contentEquals("1")) count+=1;
		if (str.substring(2,3).contentEquals("1")) count+=1;

		System.out.print(count);
	}

}
