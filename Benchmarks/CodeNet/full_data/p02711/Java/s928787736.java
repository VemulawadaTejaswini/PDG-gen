import java.util.*;

public class Main {

	static void log(String s) {
		System.out.println(s);
	}

	static void log(int i) {
		System.out.println(i);
	}

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String ans;
		
		if (a-(a % 700) == 700) {
			ans = "Yes";
		}
		else if ( (a%100)-(a%70) == 70) {
			ans = "Yes";
		}
		else if ( (a%10)-(a%7) == 7) {
			ans = "Yes";
		}
		else
			ans = "No";
		
		sc.close();
		log( ans );
	}
}	

//	2020/03/28 A
	
