import java.util.*;
import java.io.*;

public class Main {
	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int x = sc.nextInt();
		String s = sc.next();
		int y = sc.nextInt();
		
		if (s.equals("+")) {
			System.out.println(x + y);
		} else {
			System.out.println(x - y);
		}
	}

}
