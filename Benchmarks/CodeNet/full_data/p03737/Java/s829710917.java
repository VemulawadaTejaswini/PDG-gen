import java.util.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String str1, str2, str3;

		str1 = sc.nextLine().toUpperCase();
		str2 = sc.nextLine().toUpperCase();
		str3 = sc.nextLine().toUpperCase();
		str1 = str1.substring(0, 1);
		str2 = str2.substring(0, 1);
		str3 = str3.substring(0, 1);
		System.out.println(str1 + str2 + str3);
	}

}