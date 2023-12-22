import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int a[] = new int[4];
		for(int i =0 ;i < 4; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int b[] = {1,4,7,9};
		for(int i =0 ; i < 4; i++){
			if(a[i] != b[i]){
				System.out.println("NO");
				return ;
			}
		}
		System.out.println("YES");
	}
}
