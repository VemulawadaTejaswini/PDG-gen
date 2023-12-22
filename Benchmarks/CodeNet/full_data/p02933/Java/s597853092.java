import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		
		if (N >= 3200) {
			System.out.println(s);
		} else {
			System.out.println("red");
		}

	}	
}


