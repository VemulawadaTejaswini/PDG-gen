import java.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		List<String> alph = Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R",
				"S","T","U","V","W","X","Y","Z");
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next();
		
		for (int i = 0; i < str.length(); i++) {
		    String str2 = String.valueOf(str.charAt(i));
		    int num = alph.indexOf(str2);
		    String newWord = alph.get((num + N ) % 26);
		    System.out.print(newWord);
		}
	}
}