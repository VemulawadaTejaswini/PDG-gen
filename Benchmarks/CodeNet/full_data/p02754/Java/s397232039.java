import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int a = kb.nextInt();
		int b = kb.nextInt();
//		int i = 0;
//		int j = 0;
//		int count = 0;
//		String s = "";
//		while (i < a) {
//			s += 'b';
//			i++;
//		}
//		while (j < b) {
//			s += 'r';
//			j++;
//		}
//		while (s.length() < n) {
//			s+='b';
//		}
//		if (s.length() > n) {
//			String p = "";
//			for (int k = 0; k < 8; k++) {
//				p += s.charAt(k);
//			}
//			s = p;
//		}
//		for (int k = 0; k < s.length(); k++) {
//			if (s.charAt(k) == 'b') {
//				count += 1;
//			}
//		}
//		System.out.println(count);
		if (a==0) 
			System.out.println(0);
		else if (a<=n) {
			if (a+b>=n) System.out.println(a);
			else System.out.println(a+(n-a-b));
		}else if (a>n) {
			System.out.println(n);
		}
		
		
		kb.close();
	}

}
