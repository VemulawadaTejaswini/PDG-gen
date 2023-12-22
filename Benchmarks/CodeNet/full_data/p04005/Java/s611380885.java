import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] block = {a,b,c};
		long judge = a*b*c;
		long ans;
		if(judge%2==0) {
			ans = 0;
		}
		else {
			Arrays.sort(block);
			long min = block[0]*block[1]*(block[2]/2);
			long max = block[0]*block[1]*((block[2]+1)/2);
			ans = max-min;
		}
		System.out.println(ans);
	}
}