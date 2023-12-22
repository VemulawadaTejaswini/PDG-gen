import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int bin = 0;
		for(int i=0;i<n;i++) {
			bin |= sc.nextInt();
		}
		System.out.println(Integer.numberOfTrailingZeros(bin));
	}

}
