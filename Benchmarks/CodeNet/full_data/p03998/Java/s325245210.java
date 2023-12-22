import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		StringBuffer A = new StringBuffer(a);
		int count = a.length();
		int x = 1;
		for(int i = 1; i < count; i++) {
			if(A.substring(0, 1).equals("B")) {
				A.delete(0, 1);
				continue;
			}
			if(A.substring(i-1, i).equals("B")){
				A.delete(i-2, i);
				i -= 2;
				x += 1;
			}
			x += 1;
			if(x == count) {
				break;
			}

		}
	System.out.println(A);
	}
}