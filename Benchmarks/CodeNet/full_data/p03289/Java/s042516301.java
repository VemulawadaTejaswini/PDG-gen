import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean c = true;
		if(s.charAt(0) != 'A' || s.substring(2, s.length()).split("C").length != 2) c = false;
		char[] set = s.toCharArray();
		if(c)for(int i = 1; i < set.length; i++) {
			if(set[i] != 'C' && !Character.isLowerCase(set[i])) {
				c = false;
				break;
			}
		}
		if(c)System.out.println("AC");
		else System.out.println("WA");
	}
}