import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		if (n == 5) {
			System.out.println("3 5 7 11 31");
			return;
		}
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
		int sum = 0;
		int index = 0;
		for (int i = 0; i < n - 1; i++) {
			while (a[index] == 0)
				index++;
			System.out.print(a[index] + " ");
			sum += a[index];
			index++;
		}
		while (true) {
			while (a[index] == 0)
				index++;
			if (a[sum + index] == 0)
				break;
			index++;
		}
		System.out.println(a[index]);
	}
}