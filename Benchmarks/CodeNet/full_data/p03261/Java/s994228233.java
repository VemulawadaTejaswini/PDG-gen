import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = Integer.parseInt(input.nextLine());
		LinkedList<String> words = new LinkedList<String>();
		words.add(input.nextLine());
		boolean valid = true;
		for (int i = 1; i < N; i++) {
			String x = input.nextLine();
			String prev = words.get(i-1);
			if (words.contains(x)||x.charAt(0)!=prev.charAt(prev.length()-1)) {
				valid = false;
				break;
			}
			words.add(x);
		}
		System.out.println(valid? "Yes":"No");
	}
}