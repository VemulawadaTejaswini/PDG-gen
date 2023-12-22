import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("文章を入力");
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();

		if(s1.indexOf("dream") != -1 || s1.indexOf("dreamer") != -1 
				|| s1.indexOf("erase") != -1||s1.indexOf("eraser") != -1) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
