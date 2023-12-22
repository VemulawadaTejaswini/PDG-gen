import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s[] = new int[6];
		for(int i = 0; i < 6; i++) {
			s[i] =  sc.nextInt();
		}
		if(s[4]-s[0] > s[5]) {
			System.out.println(":(");
		} else {
			System.out.println("Yay!");
		}

	}
}