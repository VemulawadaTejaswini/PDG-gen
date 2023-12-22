import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count = 0;
		int ans = 0;
		int num = 0;
		for(int i = 1; i <= a; i++) {
			num = i;
			while(num != 0) {
				num = num / 10;
				count++;
			}
			if(!(count % 2 == 0)){
				ans++;
			}
			count = 0;
		}
		System.out.println(ans);
	}
}