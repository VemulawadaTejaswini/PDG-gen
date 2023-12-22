import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A<10) {
			if(B<10) {
				System.out.println(A*B);
			}
			
		}else {
			System.out.println("-1");
		}
	}
}