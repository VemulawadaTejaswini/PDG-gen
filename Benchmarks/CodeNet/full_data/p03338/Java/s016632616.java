import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = Integer.parseInt(in.nextLine());
		String line = in.nextLine();
		List<Character> input = new ArrayList<>();
		for (int i = 0; i < num; ++i) {
			input.add(new Character(line.charAt(i)));
		}
		
		System.out.println(calc(input));

		in.close();

	}

	public static long calc(List<Character> input) {
		long result = Integer.MIN_VALUE;
		for(int i = 1; i < input.size(); ++i) {
			long firstNum = input.subList(0, i).stream().distinct().count();
			long lastNum = input.subList(i, input.size()).stream().distinct().count();
			long num = Math.min(firstNum, lastNum);
			if(num > result) {
				result = num;
			}
		}
		return result;
	}

}
