import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();

		if(r-l+1 >= 2019) {
			System.out.println("0");
			return;
		}
		int ans = 2019;
		for(int i=l; i<r; i++) {
			for(int j=i+1; j<=r; j++) {
				int tmp = (i*j)%2019;
				if(ans > tmp) {
					ans = tmp;
				}
			}
		}
		System.out.println(ans);
	}
}
