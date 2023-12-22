import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		Integer[] intList = {a,b,c};
		Arrays.sort(intList, Comparator.reverseOrder());
		int sum = intList[0]*10 + intList[1] + intList[2];
		
		System.out.println(sum);
	}

}