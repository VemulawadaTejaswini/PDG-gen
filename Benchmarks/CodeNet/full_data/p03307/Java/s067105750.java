import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int min = N * 2;


		for(int i = 1; i<=min; i++){
			if(i % N == 0 && i % 2 == 0){
				System.out.println(i);
				break;
			}
		}

		sc.close();
	}

}
