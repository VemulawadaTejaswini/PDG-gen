import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Scannerで値取得。
		 */
		Scanner row = new Scanner(System.in);
		Scanner sForNum = new Scanner(System.in);

		int[] day = new int[4];
		
		for (int i = 0; i < 4; i++) {
			day[i] = row.nextInt();
		}

		if(day[0]==day[2]) {
		//表示
		System.out.print(0);
		}else {
			System.out.println(0);
		}
	}
}