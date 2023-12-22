import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		String[] strStdIn = inputString.split(" ", 0);
		List<String> list = Arrays.asList(strStdIn);
		
		Collections.sort(list);
		
		int min0 = Integer.parseInt(list.get(0));
		int min1 = Integer.parseInt(list.get(1));
		
		System.out.println(min0 + min1);
		
	}
}