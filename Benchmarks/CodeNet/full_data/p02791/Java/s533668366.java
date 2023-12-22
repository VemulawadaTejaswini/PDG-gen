import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int min = Integer.MAX_VALUE;
		int i;
		int temp;
		long ans = 0;
		for(i = 0; i < n; i++) {
			temp = scan.nextInt();
			if(temp < min) {
				min = temp;
				ans++;
			}
		}
		System.out.println(ans);
	}
}