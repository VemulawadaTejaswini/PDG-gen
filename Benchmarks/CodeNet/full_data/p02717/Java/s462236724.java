import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int[] cba = {Z,Y,X};
		for(int i : cba) {
			System.out.print(i + " ");
		}
		sc.close();
	}
}
