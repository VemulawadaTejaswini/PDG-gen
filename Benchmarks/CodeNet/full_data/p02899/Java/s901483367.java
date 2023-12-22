import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int students = sc.nextInt();
		int studentNum[] = new int[students];

		//登校順(入力する値の大きさ順)の要素番号に、生徒番号(= i)を入力する
		for(int i=1 ; i<=students ; i++) {
			int a = sc.nextInt();
			studentNum[a-1] = i;
		}

		//0から順に表示
		for(int i=0 ; i<students ; i++) {
			System.out.print(studentNum[i] + " ");
		}
		sc.close();
	}
}