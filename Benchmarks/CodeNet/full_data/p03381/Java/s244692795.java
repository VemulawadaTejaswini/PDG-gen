import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//個数の入力
		int inputNum = sc.nextInt();
		//改行の読み込み
		sc.nextLine();
		//数字の入力
		String input = sc.nextLine();

		int centerValue = inputNum / 2;

		//String型の配列をint型にする
		String[] arrayStr = input.split(" ");
		int[] arrayInt = new int[arrayStr.length];
		int[] arrayIntCopy = new int[arrayStr.length];
		for(int i = 0 ; i < arrayStr.length ; i++) {
			arrayInt[i] = Integer.parseInt(arrayStr[i]);
			arrayIntCopy[i] = Integer.parseInt(arrayStr[i]);
		}
		for(int i = 0 ; i < arrayStr.length ; i++) {
			int w = arrayInt[i];
			arrayInt[i] = 0;
			Arrays.sort(arrayInt);
			System.out.println(arrayInt[centerValue]);
			arrayInt[0] = w;
		}
		sc.close();
	}
}