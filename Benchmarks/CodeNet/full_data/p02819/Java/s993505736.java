import java.util.Scanner;

public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int num = sc.nextInt();
			boolean flg = false;

			for(int j = num; flg==false ;j++) {
				for(int i = 2; i <= j; i++) {
					if( j % i == 0) {
						if( j != i) {
							break;
						}else {
							flg = true;
							break;
						}
					}
				}
			}

			System.out.print(num);

		}
}

