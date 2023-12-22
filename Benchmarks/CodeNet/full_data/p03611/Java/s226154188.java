import java.util.Scanner;
//072C
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		int n =sc.nextInt();
		int max =0;
		int min =100002;
		int ans=0;
		int[] numbers =new int[100002];
		for (int i=0;i<n;i++) {
			numbers[sc.nextInt()] ++;
		}
		for (int i=0;i<100000;i++) {
			int count=0;
			count=numbers[i]+numbers[i+1]+numbers[i+2];
			ans =Math.max(count, ans);
		}
		System.out.println(ans);
		
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	}
}