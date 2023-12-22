import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int code_int = scan.nextInt();
		String code_st = Integer.toString(code_int);
		int[] code = new int[4];
		code[0] = Integer.parseInt(code_st.substring(0, 1));
		for (int i = 1; i < 4; i++) {
			code[i] = Integer.parseInt(code_st.substring(i, i + 1));
			if (code[i - 1] == code[i]) {
				System.out.println("bad");
				return;
			}
		}
		System.out.println("good");
		return;
	}
}