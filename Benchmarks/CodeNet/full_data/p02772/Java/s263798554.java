import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		List<Integer> numList = new ArrayList<>();
		while(num>0) {
			int nextNum = sc.nextInt();
			numList.add(nextNum);
			num--;
		}
		List<Integer> resultNumList = numList.
				stream()
				.filter(n -> isResult(n))
				.collect(Collectors.toList());
		
		if(resultNumList.isEmpty()) {
			System.out.println("DENIED");
		} else {
			System.out.println("APPROVED");
		}
		
	}
	
	private static boolean isResult(int num) {
		return (isNotOdd(num) && isSplitByThreeAndFile(num)) || !isNotOdd(num);
	}
	
	
	private static boolean isNotOdd(int num) {
		return Integer.valueOf(num)%2 == 0;
	}

	private static boolean isSplitByThreeAndFile(int num) {
		return num%3 == 0 && num%5 == 0;
	}
}
