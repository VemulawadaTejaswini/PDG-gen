import java.util.ArrayList;
import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		ArrayList<String> candidate = new ArrayList<>();
		candidate.add("1");
		candidate.add("2");
		candidate.add("3");
		
		candidate.remove(a);
		candidate.remove(b);
		
		System.out.println(candidate.get(0));
		sc.close();

	}
}
	