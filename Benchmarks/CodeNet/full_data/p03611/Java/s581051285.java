
import java.util.Scanner;
//072C
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		int n =Integer.parseInt(sc.next());
		int[] numbers = new int[n];
		int max=0;
		int min=10000;
		for (int i=0;i<n;i++) {
			numbers[i] =Integer.parseInt(sc.next());
			max =Math.max(max, numbers[i]);
			min =Math.min(min, numbers[i]);
		}
		int ans =0;
		for (int x=min;x<=max;x++) {
			int count =0;
			for (int i=0;i<n;i++) {
				if (numbers[i]==x-1||numbers[i]==x||numbers[i]==x+1) {
					count ++;
				}
			}
			ans =Math.max(ans, count);
		}
		System.out.println(ans);
		
		
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	}
}