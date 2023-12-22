import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("A", "T");
		map.put("T", "A");
		map.put("C", "G");
		map.put("G", "C");
		Scanner sc = new Scanner(System.in);
		System.out.println(map.get(sc.next()));
	}

}