
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long masu = scan.nextLong();
		long[] height = new long[1000000];
		int count = 0;

		for(int i=0;i<masu;i++) {
			height[i] = scan.nextLong();
		}

		for(int i=0;i<masu;i++) {
			if(height[i] >= height[i+1]) {
				count++;
			}else {
				count = 0;
			}
		}

		System.out.println(count-1);
		scan.close();

	}

}
