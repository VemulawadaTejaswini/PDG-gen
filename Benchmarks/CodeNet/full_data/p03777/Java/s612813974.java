
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();
		String ans;
        if (a == "H") {
            ans = b;
        } else {
            if (b == "H") {
                ans = "D";
            } else {
                ans = "H";
            }
        }
        System.out.println(ans);
    }
}
