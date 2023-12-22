import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		int counter = 0;
		for(int i=1; i<=n; ++i) {
			int sum = 0;
			String formated = String.format("%04", i);
			for(int j=0; j<= 3; ++j) {
				int num = (int)formated.charAt(j);
				sum += num;
			}
			if(a <= sum && sum <= b) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
