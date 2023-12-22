import java.util.Scanner;
//072C
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		int n =sc.nextInt();
		int[] numbers = new int[n];
		int max=0;
		int min=100000;
		for (int i=0;i<n;i++) {
			numbers[i] = sc.nextInt();
			max =Math.max(max, numbers[i]);
			min =Math.min(min, numbers[i]);
		}
		int ans =0;
		for (int x=min;x<=max;x++) {
			int count =0;
			for (int i=0;i<n;i++) {
				if (x-1<=numbers[i]&&numbers[i]<=x+1) {
					count ++;
				}
			}
			ans =Math.max(ans, count);
		}
		System.out.println(ans);
		
		
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	}
}