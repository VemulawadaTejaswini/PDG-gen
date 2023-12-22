import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int count = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt() - 1;
			if (a[i] < i && a[a[i]] == i) count++;
		}

		System.out.println(count);
	}
}
