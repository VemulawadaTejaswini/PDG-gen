import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int date = sc.nextInt(); //整数の入力
		System.out.print("Christmas");
		for (int x = date; date < 25; x++) {
			System.out.print(" Eve");
		}
		System.out.println();
	}
}