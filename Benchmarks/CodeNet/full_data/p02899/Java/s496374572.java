import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] mens = new int[n];
		for(int i = 0; i < n; i++) {
			mens[i] = sc.nextInt();
		}
		int num = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(mens[j] == num) {
					System.out.println(j + 1);
					break;
				}
			}
			num++;
		}

	}

}
