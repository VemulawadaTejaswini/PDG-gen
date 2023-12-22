import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int count = 0;
		if(sc.next() != null) {
			count++;
		}
		int array[] = new int[count];
		for (int i = 0; i<count; i++) {
			if(array[i] >= (1/4*M)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}