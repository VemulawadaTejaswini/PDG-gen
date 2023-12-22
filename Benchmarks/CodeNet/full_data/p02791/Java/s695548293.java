import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p[] = new int[n];

		int max = 999999;
		int tmp;
		int c=0;
		for(int i = 0; i < n; i++) {
			tmp= sc.nextInt();
			if(tmp < max) {
				max = tmp;
				c++;
			}
		}

		System.out.println(c);
        return;
    }

}

