import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s;
		
		s = sc.next();
		
		sc.close();
		
		int n = s.length();
		
		String ans = "", tmp1, tmp2;
		
		int i = 1, length = n;
		
		while(true) {
			length = n - i;
			ans = s.substring(0,  length);
			if(length % 2 == 0) {
				tmp1 = ans.substring(0, length / 2);
				tmp2 = ans.substring(length / 2, length);
				if(tmp1.equals(tmp2))break;
			}			
			++i;
		}
		
		System.out.println(length);
	}

}
