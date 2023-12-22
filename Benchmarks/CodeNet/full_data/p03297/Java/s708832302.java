import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int e = 0; e < T; e++) {
			long a = scan.nextLong();
			System.out.println("input a");
			long b = scan.nextLong();
			long c = scan.nextLong();
			long d = scan.nextLong();
			if (a < b) {
				System.out.println("No");
				continue;
			}

			if (b > d) {
				System.out.println("No");
				continue;
			}

			long underCnum = a;
			long minUnderC = Long.MAX_VALUE;
			long increaseNum = d - b;
			// while(underCnum > c) {
			// 	underCnum -= b;
			// }
			long temp = a - c;
			temp = temp %b;
			temp = b - temp;
			underCnum = c - temp;


			while(true) {
			 	if (underCnum < 0) {
					System.out.println("No");
					break;
				}

				if (increaseNum < 0) {
					System.out.println("No");
					break;
				}  else if (increaseNum == 0) {
					System.out.println("Yes");
					break;
				}
				while(underCnum <= c) {
					underCnum += increaseNum;
				}
				while(underCnum > c) {
					underCnum -= b;
				}
				//System.out.println("underCnum: " + underCnum);
				//System.out.println("firstUnderC: " + minUnderC);
				if (underCnum < 0) {
					System.out.println("No");
					break;
				} else if(underCnum == minUnderC) {
					System.out.println("Yes");
					break;
				}
				if (minUnderC > underCnum) {
					minUnderC = underCnum;
				}
			}
		}
	}
}