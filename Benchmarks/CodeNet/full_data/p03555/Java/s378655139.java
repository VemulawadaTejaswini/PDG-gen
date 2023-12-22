import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//二次元配列の生成
		String[][] C = new String[2][3];
		for(int i = 0; i <= 1; i++) {
			String s = sc.next();
			for(int j = 0; j <= 2; j++) {
				C[i][j] = s.substring(j, j + 1);
			}
		}
		sc.close();
		if(C[0][0].equals(C[1][2]) && C[0][1].equals(C[1][1]) && C[0][2].equals(C[1][0])) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}
}