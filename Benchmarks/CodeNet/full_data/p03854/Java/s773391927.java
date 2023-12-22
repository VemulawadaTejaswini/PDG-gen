
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String t = sc.next();

		
		t = t.replaceAll("dream", ".");
		t = t.replaceAll("dreamer", ".");
		t = t.replaceAll("erase", ".");
		t = t.replaceAll("eraser", ".");
		t = t.replaceAll(".", "");
		
		if(t.length()== 0){
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
