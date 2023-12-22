import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		S = S.replaceAll("eraser","").replaceAll("erase","").replaceAll("dreamer","").replaceAll("dream","");

		System.out.println(S);

		if(S.equals("")) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
