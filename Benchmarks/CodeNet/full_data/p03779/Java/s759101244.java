
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
	ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			if((i*(i+1))/2>=n) {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}
}