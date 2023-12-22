

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String result = "No";

		switch(x){
		case 3:
		case 5:
		case 7:
			result = " Yes";

		}

		System.out.println(result);

	}

}
