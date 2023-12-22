
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int masu = scan.nextInt();
		long[] height = new long[masu];
		int count = 0;
		int max = 0;

		for(int i=0;i<masu;i++) {
			height[i] = scan.nextLong();
		}

		for(int i=0;i<masu-1;i++) {
			if(height[i] >= height[i+1]) {
				count++;
			}else {
				count = 0;
			}
			if(max<count) {
				max = count;
			}
		}

		System.out.println(max);
		scan.close();

	}

}
