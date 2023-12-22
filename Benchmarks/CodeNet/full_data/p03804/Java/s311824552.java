import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] in = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      
		List<List<String>> A = new ArrayList<>();
		List<List<String>> B = new ArrayList<>();
		
		for (int i = 0; i < in[0]; i++) {
			List<String> a = Arrays.asList(sc.nextLine().split(""));
			A.add(a);
		}
		
		for (int i = 0; i < in[1]; i++) {
			List<String> b = Arrays.asList(sc.nextLine().split(""));
			B.add(b);
		}
		
		String res = null;
		for (int i = 0; i < B.size(); i++) {
			for (int j = 0; j < B.get(i).size(); j++) {
				res = (A.get(i).get(j).equals(B.get(i).get(j))) ? "Yes" : "No";
			}
		}
		
		System.out.println(res);		
	}
}
