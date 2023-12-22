import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		int k = 0;
		for(int i=0; i<n; i++) {
			p[i] = sc.nextInt();
			if((i+1) != p[i]) {
				k++;
			}
		}
		sc.close();
		if(k<=2) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}