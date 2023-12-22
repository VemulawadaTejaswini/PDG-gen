import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long hp = sc.nextLong();
		System.out.println(at(hp));
	}

	static long at(long hp) {
		if(hp==1) return 1;
		return 2*at((long)hp/2)+1;
	}
}