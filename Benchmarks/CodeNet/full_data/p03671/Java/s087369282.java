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
		List<Integer> intList = new ArrayList<>();
		
		list.forEach(str -> intList.add(Integer.parseInt(str)));
		
		Collections.sort(intList);
		
		int min0 = intList.get(0);
		int min1 = intList.get(1);
		
		System.out.println(min0 + min1);
		
	}
}