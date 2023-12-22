import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		int ct = 0;
		for (int i=1 ; i<=n ;i++) {
			int h = Calc(i);
			if (h >= a && h <= b) {
				ct += i;
			}
		}	
		
		System.out.println(ct);

	}
	
	
	public static int Calc(int k) {
		int total = 0;
		String s = String.valueOf(k);
		List<Character> l = new ArrayList<>();
		for (int i=0 ; i< s.length();i++) {
			l.add(s.charAt(i));
		}
		for (int i=0 ; i< l.size();i++) {
			total += Character.getNumericValue(l.get(i));
		}
		
		return total;
	}

}
