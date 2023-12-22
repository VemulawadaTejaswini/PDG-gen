import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a[] = new int[100]; 
		int n = sc.nextInt(); 
		int d = sc.nextInt(); 
		int x = sc.nextInt(); 
		int sum = 0;
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			for(int j = 1; j <= d; j = j+a[i]) {
				sum++;
			}
		}
		System.out.println(x+sum);
	}
}