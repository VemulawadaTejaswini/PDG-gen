import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'R') {
				count++;
			}
		}

		if( count > (n-count) ) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}