import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int a[] = new int[3];
		for(int i = 0; i < 3; i++) a[i] = sc.nextInt();
		int max = -1;
		int idx = 0;
		for(int i = 0; i < 3; i++) {
			if(max < a[i]) {
				max = a[i];
				idx = i;
			}
		}
		a[idx] *= 10;
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}
