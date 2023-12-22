import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0,count2 = 0;
		for(int i = 0;i < 3;i++) {
			int a = sc.nextInt();
			if(a == 5) {
				count++;
			}
			if(a == 7) {
				count2++;
			}
		}
		if(count == 2&& count2== 1) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}