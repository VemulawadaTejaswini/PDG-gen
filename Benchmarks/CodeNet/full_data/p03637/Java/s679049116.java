import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[]a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		for(int i = 0; i < N; i++){
			if(a[i] % 4 == 0) {
				cnt1++;
			}else if(a[i] % 2 == 0) {
				cnt2++;
			}else {
				cnt3++;
			}
		}
		if(cnt1 >= cnt3 + 1 && cnt2 == 0) {
			System.out.println("Yes");
			System.exit(0);
		}
		if(cnt1 >= cnt3) {
			System.out.println("Yes");
			System.exit(0);
		}
		System.out.println("No");
	}
}