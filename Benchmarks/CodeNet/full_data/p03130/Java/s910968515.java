import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		for(int i = 0; i < 6; i++) {
			int n = sc.nextInt();
			if(n == 1) {
				count1++;
			} else if(n == 2) {
				count2++;
			} else if(n == 3) {
				count3++;
			} else {
				count4++;
			}
		}
		if(count1 == 0 || count2 == 0 || count3 == 0 || count4 == 0) {
			System.out.println("NO");
		} else if(count1 == 3 || count2 == 3 || count3 == 3 || count4 == 3) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}
