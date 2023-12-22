

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a[][] = new int[3][3];
		boolean flag = true;
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 3; i++) {
				a[i][j] = in.nextInt();
			}
		}

		int sa1 = a[0][1] - a[0][0];
		int sa2 = a[1][1] - a[1][0];
		int sa3 = a[2][1] - a[2][0];

		int sa21 = a[0][2] - a[0][0];
		int sa22 = a[1][2] - a[1][0];
		int sa23 = a[2][2] - a[2][0];

		int sa31 = a[0][2] - a[0][1];
		int sa32 = a[1][2] - a[1][1];
		int sa33 = a[2][2] - a[2][1];

		if (sa1 == sa2 && sa1 == sa3) {
			if (sa21 == sa22 && sa21 == sa23) {
				if (sa31 == sa32 && sa31 == sa33) {
					flag = true;
				} else {
					flag = false;
				}
			} else {
				flag = false;
			}
		} else {
			flag = false;
		}
		
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
			
		}

	}
}
