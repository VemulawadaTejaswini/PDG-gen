import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String b = sc.next();
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("A", "T");
		map.put("T", "A");
		map.put("G", "C");
		map.put("C", "G");
		
		System.out.println(map.get(b));
	}
}