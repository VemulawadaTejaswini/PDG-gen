import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		int N;
		boolean b = false;
		N = stdin.nextInt();
		if(N<1200){
		for (int i = 1; i <= 3500; i++) {
			for (int j = 1; j <= i; j++) {
				for (int k = 1; k <= j; k++) {
					if (4 * i * j * k == N * i * j + N * j * k + N * k * i) {
						System.out.println(i + " " + j + " " + k);
						b = true;
					}
					if (b)
						break;
				}
				if (b)
					break;
			}
			if (b)
				break;
		}
		}else if(N>2300){
			for (int i = 3500; i >= 0; i--) {
				for (int j = 3500; j >= i; j--) {
					for (int k = 3500; k >= j; k--) {
						if (4 * i * j * k == N * i * j + N * j * k + N * k * i) {
							System.out.println(i + " " + j + " " + k);
							b = true;
						}
						if (b)
							break;
					}
					if (b)
						break;
				}
				if (b)
					break;
			}
		}else {
			for (int i = 1; i <= 3500; i++) {
				for (int j = 3500; j >= i; j--) {
					for (int k = 1; k <= j; k++) {
						if (4 * i * j * k == N * i * j + N * j * k + N * k * i) {
							System.out.println(i + " " + j + " " + k);
							b = true;
						}
						if (b)
							break;
					}
					if (b)
						break;
				}
				if (b)
					break;
			}
			
			
		}