import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String ans;
		String [] vowel = {"a", "e", "i", "o", "u"};
		List<String> aa = Arrays.asList(vowel);
		if (aa.contains(input)) {
			ans = "vowel";
		} else {
			ans = "consonant";
		}
		System.out.println(ans);
		sc.close();
	}
}