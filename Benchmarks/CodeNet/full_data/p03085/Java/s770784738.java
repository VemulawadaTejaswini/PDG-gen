import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		String b = scanner.next();

		Map<String, String> enki = new HashMap<>();
		enki.put("A", "T");
		enki.put("T", "A");
		enki.put("C", "G");
		enki.put("G", "C");

		System.out.println(enki.get(b));
	}
}
