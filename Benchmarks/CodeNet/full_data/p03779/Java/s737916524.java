import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int range = 0;
		int time = 0;
		while (x > range) {
			time++;
			range += time;
		}
		System.out.println(time);
	}

}