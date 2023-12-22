import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		String s = v.nextLine();
		String out = coffe(s);
		System.out.println(out);
		v.close();
		
	}
	public static String coffe(String s) {
		String out = "";
		if(s.charAt(2) == s.charAt(3)) {
			if(s.charAt(4) == s.charAt(5)) {
				out = "Yes";
			}
			
		}else {
			out = "No";
		}
		return out;
	}

}
