import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int evens = scan.nextInt();
		int odds = scan.nextInt();
		int sum = 0;
		sum += (evens * (evens - 1)) / 2;
		sum += (odds * (odds - 1)) / 2;
		System.out.println(sum);
	}

}
