import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();

		int count = z;
		int ans = 0;
		for(int i = 0; x >= count + y + z; i++){
			count += y + z;
			ans++;
		}
		System.out.println(ans);
	}
}