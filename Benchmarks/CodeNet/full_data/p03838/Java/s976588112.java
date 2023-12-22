import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		if(x <= 0 && y <= 0) {
			if(Math.abs(x) <= Math.abs(y)) {
				System.out.println(2 + Math.abs(-y + x));
			}else {
				System.out.println(Math.abs(-y + x));
			}
		}else if(x <= 0 && y >= 0) {
			if(Math.abs(x) <= Math.abs(y)) {
				System.out.println(1 + Math.abs(y + x));
			}else {
				System.out.println(Math.abs(y - x));
			}
		}else if(x >= 0 && y <= 0) {
			System.out.println(1 + Math.abs(y + x));
		}else if(x >= 0 && y >= 0){
			if(Math.abs(x) <= Math.abs(y)) {
				System.out.println(Math.abs(y - x));
			}else {
				System.out.println(1 + Math.abs(y + x));
			}
		}

	}
}