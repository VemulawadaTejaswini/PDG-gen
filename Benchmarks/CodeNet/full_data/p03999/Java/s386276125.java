import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long sum = 0;
		for(int i = 0; i < s.length(); i++) {
			long coefficient = 0;
			for(int j = 0; j < s.length(); j++) {
				if(j == i)
					coefficient += (long)(Math.pow(10, j)*Math.pow(2, s.length() - 1 - j));
				else if(j < i)
					coefficient += (long)(Math.pow(10, j)*Math.pow(2, s.length() - 2 - j));
			}
			sum += coefficient*(Integer.parseInt(s.substring(s.length() - 1 - i, s.length() - i)));
		}
		System.out.println(sum);
	}
}