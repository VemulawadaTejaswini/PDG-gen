import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static int getRank(int val) {
		if(val <= 399) return 0;
		if(val <= 799) return 1;
		if(val <= 1199) return 2;
		if(val <= 1599) return 3;
		if(val <= 1999) return 4;
		if(val <= 2399) return 5;
		if(val <= 2799) return 6;
		if(val <= 3199) return 7;
		return 8;
	}

	public static void main(String[] args) {

		int rankNum = 9;
		int[] count = new int[rankNum];
		Arrays.fill(count, 0);

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++)
			count[getRank(sc.nextInt())]++;
		sc.close();

		int colorNum = 0;
		for(int i=0; i<count.length - 1; i++) {
			if(count[i] != 0)
				colorNum++;
		}
		int minColorNum = (int)Math.max(colorNum, 1);
		int maxColorNum = colorNum+count[count.length-1];
		System.out.println(minColorNum + " " + maxColorNum);
	}
}
