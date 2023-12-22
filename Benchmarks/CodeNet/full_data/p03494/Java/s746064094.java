import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //入力

		int Integer_number = sc.nextInt();  //整数の数
		int[] number = new int[Integer_number]; //整数
		String[] kindOfNumber = new String[Integer_number]; //偶数か奇数か

		int numberofDividing = 0; //割った回数

		for(int i = 0 ;i < Integer_number;i++) { //整数を3つ入力する。
			number[i] =  sc.nextInt(); //整数入力
		}

loop: //ループを抜け出す。
		while(true) {
			for(int j = 0; j < Integer_number; j++) {

				if(number[j] % 2 == 0) {
					number[j] = number[j] / 2;
				}else {
					break loop;
				}
				if(j + 1 == Integer_number) {
					numberofDividing++;
				}
			}
		}

		System.out.println(numberofDividing);
	}
}