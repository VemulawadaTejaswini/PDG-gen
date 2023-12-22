import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		a[0] = Integer.parseInt(sc.next());
		a[1] = Integer.parseInt(sc.next());
		a[2] = Integer.parseInt(sc.next());
		int count = 0;
		while (true) {
			int max = 0;
			for (int i = 0; i < 3; i++)
				max = Math.max(max, a[i]);
			int c = 0;
			int[] index = new int[2];
			int i = 0;;
			for (int j = 0; j < 3; j++)
				if (a[j] == max)
					c++;
				else
					index[i++] = j;
			if (c == 3) {
				break;
			}
			else if (c == 2) {
				a[index[0]] += 2;
			}
			else {
				a[index[0]]++;
				a[index[1]]++;
			}
			count++;
		}
		System.out.println(count);
	}
}