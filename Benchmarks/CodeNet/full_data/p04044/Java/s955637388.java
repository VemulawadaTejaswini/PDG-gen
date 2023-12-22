import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int length = sc.nextInt();
		List<String> abc = new ArrayList<String>();
		for(i=0;i<number;i++) {
			abc.add(sc.next());
		}
		Collections.sort(abc);
		String result = String.join("", abc);
		System.out.println(result);
	}
}