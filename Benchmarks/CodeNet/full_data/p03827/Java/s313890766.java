import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			String s = sc.next();
			if(s.equals("I")) {
				count++;
			} else count--;
		}
		System.out.println(count);
	}

}
