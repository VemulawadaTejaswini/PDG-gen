import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		int a[] = new int[3];
		int max = 0;

		for(int i = 0 ; i < 3; i++) {
			a[i] = sc.nextInt();
			if(max < a[i]) max = i;
		}
		int ans = 1;
		for(int i = 0; i < 3; i++) {
			if(i != max)ans *= a[i];
		}
		System.out.println(ans / 2);
	}


	public static void main(String[] args) {
		new Main().doIt();
	}
}
