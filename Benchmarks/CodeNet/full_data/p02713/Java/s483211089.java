import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		sc.close();

		long answer = 0;
		for(int a = 1; a <= K; a++) {
			for(int b = 1; b <= K; b++) {
				for(int c = 1; c <= K; c++) {
					int t = 0;
					int num2 = Math.min(a, Math.min(b, c));
					/*
					if(a>=b) {
						if(c>=a) {
							num1 = a;
						}else if(c>=b) {
							num1 = c;
						}else {
							num1 = b;
						}
					}else {
						//b>a
						if(c>=b) {
							num1 = b;
						}else if(c>=a) {
							num1 = c;
						}else {
							num1 = a;
						}
					}
					*/
					ArrayList<Integer> divisor = new ArrayList<>();
					for(int i = 1; i <= num2; i++) {
						if(num2%i == 0) {
							divisor.add(i);
						}
					}
					boolean judge = false;
					for(int j = divisor.get(divisor.size()-1);judge == false;j--) {
						if(a%j==0) {
							if(b%j==0) {
								if(c%j==0) {
									t = j;
									judge = true;
								}
							}
						}
					}
					answer += t;

				}
			}
		}

		System.out.println(answer);
	}
}
