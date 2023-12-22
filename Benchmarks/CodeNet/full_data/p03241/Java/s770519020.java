

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		if(n == 1){
			System.out.println(m);
			return;
		}

		int result = 0;
		for(int i = 1; i <= m/n; i++){
			if((m - i*n) % i == 0){
				result = i;
			}
		}

		System.out.println(result);
	}
}
