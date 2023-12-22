import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] str = reader.readLine().split("");
		boolean flag_kisuu = true;
		for (int i = 0; i < str.length; i++) {
			if (i % 2 == 0) {   //1つずれて奇数
				if (str[i].equals("L")) {
					flag_kisuu = false;
					break;
				}
			}
		}
		boolean flag_guusu = true;
		for (int i = 0; i < str.length; i++) {
			if (i % 2 == 1) {   //1つずれて偶数
				if (str[i].equals("R")) {
					flag_guusu = false;
					break;
				}
			}
		}
		if (flag_kisuu && flag_guusu) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
