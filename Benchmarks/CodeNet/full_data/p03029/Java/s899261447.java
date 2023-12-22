import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int p = sc.nextInt();
		// 林檎 1個は、砕くことで林檎の欠片 3個になります。
       // また、林檎の欠片 2個を鍋で煮込むことで、アップルパイが 1個作れます。
		System.out.print((a * 3 + p) / 2);
	}

	
}
