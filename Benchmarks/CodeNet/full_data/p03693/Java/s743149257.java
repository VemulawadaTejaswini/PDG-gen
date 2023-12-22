import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int min = 0;
		int max = 0;
		int score;
		boolean[] flgs = new boolean[9];
		for(int i = 0; i < flgs.length; i++) {
			flgs[i] = true;
		}
		for(int i = 0; i < n; i++) {
			score = scan.nextInt();
			if(1 <= score && score <= 399) {
				if(flgs[0]) {
					min++; max++;
					flgs[0] = false;
				}
			} else if(400 <= score && score <= 799) {
				if(flgs[1]) {
					min++; max++;
					flgs[1] = false;
				}
			} else if(800 <= score && score <=1199) {
				if(flgs[2]) {
					min++; max++;
					flgs[2] = false;
				}
			} else if(1200 <= score && score <= 1599) {
				if(flgs[3]) {
					min++; max++;
					flgs[3] = false;
				}
			} else if(1600 <= score && score <= 1999) {
				if(flgs[4]) {
					min++; max++;
					flgs[4] = false;
				}
			} else if(2000 <= score && score <= 2399) {
				if(flgs[5]) {
					min++; max++;
					flgs[5] = false;
				}
			} else if(2400 <= score && score <= 2799) {
				if(flgs[6]) {
					min++; max++;
					flgs[6] = false;
				}
			} else if(2800 <= score && score <= 3199) {
				if(flgs[7]) {
					min++; max++;
					flgs[7] = false;
				}
			} else if(3200 <= score) {
				max++;
			}
		}
		scan.close();
		System.out.println(min+" "+max);
	}

}