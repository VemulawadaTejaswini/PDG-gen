import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		execute();
	}

	private static void execute() {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();

			int num = a /100;
			int remain = a % 100;
			
			for(int i=0; i<num; i++) {
				if(remain <= 5) {
					System.out.println("1");
					return;
				}
				remain = remain - 5;
			}
			System.out.println("0");

		}
	}
}