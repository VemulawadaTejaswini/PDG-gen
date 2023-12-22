import java.util.*;

public class B_059_Comparison{

	public static void Main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num_a = sc.next();
		String num_b = sc.next();
		int a_length = num_a.length();
		int b_length = num_b.length();
		String message = "";
		if(a_length > b_length) {
			message = "GREATER";
		} else if(a_length < b_length) {
			message = "LESS";
		} else {
			int i = 0;
			for(i = 0; i < a_length; i++) {
				int a = Integer.parseInt(num_a.charAt(i) + "");
				int b = Integer.parseInt(num_b.charAt(i) + "");
				if(a > b) {
					message = "GREATER";
					break;
				} else if(a < b) {
					message = "LESS";
					break;
				}
			}
			if(i == a_length) {
				message = "EQUAL";
			}
		}
		System.out.println(message);