import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();

		for (int i=1; i<=9&&k>0; i++){
			System.out.println(i);
			k--;
		}
		for (int i=1; i<=9&&k>0; i++){
			System.out.println(i*10+9);
			k--;
		}
		for (int i=1; i<=19&&k>0; i++){
			System.out.println(i*100+99);
			k--;
		}
		for (int i=2; i<=19&&k>0; i++){
			System.out.println(i*1000+999);
			k--;
		}
		for (int e=4; k>0; e++){
			int a = (int)Math.pow(10, e);
			for (int i=2; i<=19&&k>0; i++){
				System.out.println((i+1)*a-1);
				k--;
			}
		}
	}
}