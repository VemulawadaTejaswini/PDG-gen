
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner; 

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		System.out.println("2");
		if(k == 0)
			System.out.println("0 0");
		else {
			if(k%3 == 1)
				System.out.println((k + 1) + " 0");
			else if(k%3 == 2)
				System.out.println(k + " 1");
			else
				System.out.println(k + " 1");				
		}
		
	}
}
