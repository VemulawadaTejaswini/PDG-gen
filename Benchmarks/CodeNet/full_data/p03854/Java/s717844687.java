import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		S = S.replaceAll("eraser","").replaceAll("erase","").replaceAll("dreamer","").replaceAll("dream","");

		System.out.println(S);

		if(S.length() == 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
