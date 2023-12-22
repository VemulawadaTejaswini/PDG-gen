import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] in = sc.nextLine().split(" ");
		
		String ans = null;
		// 正直者
		if (in[0].equals("H")) {
			if (in[1].equals("H")) ans = "H";
			else ans = "D";
		}
		// 嘘つき
		else if (in[0].equals("D")) {
			if (in[1].equals("H")) ans = "D";
			else ans = "H";
		}
		
		System.out.println(ans);		
	}
}
