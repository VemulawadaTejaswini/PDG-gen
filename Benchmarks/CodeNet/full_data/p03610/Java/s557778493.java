import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		for(int i = 0;i < s1.length();i++) {
			if(i == 0 || i % 2 == 0) {
			System.out.print(s1.charAt(i));
			}else {
				System.out.print("");
			}
		}
	}
}

