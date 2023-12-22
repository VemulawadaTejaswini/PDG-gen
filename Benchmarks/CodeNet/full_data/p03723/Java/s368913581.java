import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		sc.close();
		boolean rtnFlag = false;
		int count = 0;
		int temp1 = 0;
		int temp2 = 0;
		int temp3 = 0;
		while (!rtnFlag) {
			if (n1 == n2 && n1 == n3) {
				count = -1;
				rtnFlag = true;
			} else {
				if (n1 % 2 != 0 || n2 % 2 != 0 || n3 % 2 != 0 ) {
					rtnFlag = true;
				} else {
					temp1 = n1 / 2;
					temp2 = n2 / 2;
					temp3 = n3 / 2;
					if ((n3 / 2 + temp2) % 2 == 0 && (n2 / 2 + temp1) % 2 == 0 && (n1 / 2 + temp3)  % 2 == 0) {
						n2 = n2 / 2 + temp1;
						n3 = n3 / 2 + temp2;
						n1 = n1 / 2 + temp3;
					} else if ((n3 / 2 + temp1) % 2 == 0 && (n2 / 2 + temp3) % 2 == 0 && (n1 / 2 + temp2)  % 2 == 0) {
						n2 = n2 / 2 + temp3;
						n3 = n3 / 2 + temp1;
						n1 = n1 / 2 + temp2;
					} else {
						n1 = 1;
						n2 = 0;
						n3 = 0;
					}
					count++;
				}
			}
		}
		System.out.println(count);
	}
}