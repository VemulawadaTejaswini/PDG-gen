import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] p = new int[n];
		int sotoku = 0;
		int pop = 0;


		for (int i = 0; i < n; i ++){
			p[i] = sc.nextInt();
			sotoku = sotoku + p[i];
		}

		int comp = sotoku / (4 * m);

		for (int point : p){
			if (point >= comp){
				pop ++;
			}
		}

		if (pop >= m){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}



	}

}