import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static int lcm(int[] nums, int min) {
		//System.out.println(min);
		int lcm = 1;
		boolean found;
		int diff;
		for (int k = 2; k <= min; k++) {
			found = false;
			for (int l = 0; l < nums.length -1;l++) {
				diff = nums[l + 1] - nums[l];
				//System.out.println(Math.abs(diff));
				if (Math.abs(diff) % k == 0) {
					//System.out.println(k);
					found = true;
				}
				else break;
			}
			if (found) {
				//System.out.println(k);
				lcm = k;
			}
		}
		return lcm;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		int[] cities = new int[N];
		for (int i = 0; i < N; i++) {
			cities[i] = scan.nextInt();
 		}
		if (cities.length == 1) {
			System.out.println(cities[0] - X);
			System.exit(0);
		}
		Arrays.sort(cities);
		int position = 0;
		for (int i = 0; i < cities.length; i++) {
			if (cities[i] > X) {
				position = i;
			}
		}
		//System.out.println(position);
		int diff1 = Math.abs(cities[position] - X);
		int diff2 = Math.abs(cities[position - 1] - X);
		//System.out.println(diff1 + " " + diff2);
		System.out.println(Math.min(diff1, diff2));
		
		/*
		int min = Math.abs(cities[N-1] - cities[N-2]);
		/*
		for (int j = 0; j < N-1; j++) {
			int diff = Math.abs(cities[j+1] - cities[j]);
			if ( diff < min) min = diff;
		}
		min = cities[1] -cities[0];
		System.out.println(lcm(cities,min));
		*/
	}

}