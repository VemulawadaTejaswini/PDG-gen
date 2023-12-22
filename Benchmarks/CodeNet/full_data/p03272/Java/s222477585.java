import java.util.Scanner;
public class Main {

	static int answer = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("車両変数を入力してください。");
		int N = sc.nextInt();

		if ((N<1) || (N>100)) {
			System.out.print("1から100の間で入力してください。");
			
		} else {
			System.out.print("前から何両目かを入力してください。");
			int i = sc.nextInt();
			if ((i<1) || (i>N)) {
			System.out.print("1から"+N+"の間で入力してください。");
			
			} else {
				answer = N - i + 1;
			}
		}

		if (!(answer == 0)) {
			System.out.print(answer);
		}
		
        sc.close();

	}

}
