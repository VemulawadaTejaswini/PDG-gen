import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int count = 0;
		int max = 0;
		for(char c : s.toCharArray()) {
			if(c == 'I') {
				count++;
			} else {
				if(max < count) {
					max = count;
				}
				count--;
			}
		}
		if(max < count) {
			max = count;
		}
		System.out.println(max);
	}
}