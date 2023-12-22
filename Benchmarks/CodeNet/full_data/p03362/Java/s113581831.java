import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int upper = 55555;
		int a[] = new int[upper+1];
		for (int i = 2; i <= upper; i++) {
			a[i] = i;
		}
		for (int i = 2; i <= Math.sqrt(upper); i++) {
			for (int j = i + i; j <= upper; j += i) {
				a[j] = 0;
			}
		}
		int index = 0;
		for (int i = 0; i < n - 1; i++) {
			while (a[index] == 0 || a[index] % 10 != 1)
				index++;
			System.out.print(a[index] + " ");
			index++;
		}
		while (a[index] == 0 || a[index] % 10 != 1)
			index++;
		System.out.println(a[index]);
	}
}