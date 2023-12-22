import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < size; i++){
			sb.append(sc.nextLong());
			sb = sb.reverse();
			sb.append(" ");
		}
		System.out.println(sb.toString().substring(0, sb.length() - 1));
		sc.close();
	}

}