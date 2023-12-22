import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int temp;
		int max = x;
		for(int i = 0; i < n; i++) {
			temp = sc.nextInt();
			//System.out.println(temp);
			if(max < temp) max = temp;
		}

		//System.out.println(max);
		for(int i = 0; i < m; i++) {
			temp = sc.nextInt();
			if(max >= temp) {
				System.out.println("War");
				return;
			}
		}
		if(max >= y) {
			System.out.println("War");
			return;
		}
		System.out.println("No War");

	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}
