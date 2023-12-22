
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	int a = scanner.nextInt();
	int b = scanner.nextInt();

	int[] A = new int[b];

	int sum = 0;

	for(int i = 0; i < b ; i++){
		A[i] = scanner.nextInt();
	}
	for(int c : A)
		sum += c;

	if(a - sum < 0)
		System.out.println(-1);
	else
		System.out.println(a - sum);
    }
}
