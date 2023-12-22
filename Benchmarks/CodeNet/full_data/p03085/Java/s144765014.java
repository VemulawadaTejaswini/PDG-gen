import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		char ATCG = sc.next().charAt(0);
		if('A' == ATCG) {
			System.out.println("T");
		}else if(ATCG == 'T') {
			System.out.println("A");
		}else if(ATCG == 'G') {
			System.out.println("C");
		}else if(ATCG == 'C') {
			System.out.println("G");
		}
	}

}