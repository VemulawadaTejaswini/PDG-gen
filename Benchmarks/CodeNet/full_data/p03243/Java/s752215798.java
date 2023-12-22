import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String n = Integer.toString(N);
		String a[] = n.split("", 0);
		int b[] = new int[a.length];
		int max = 0;
		for(int i = 0;i < a.length;i++) {
			b[i] = Integer.parseInt(a[i]);
			if(max < b[i]) {
				max = b[i];
			}
		}
		for(int i = 0;i < a.length;i++) {
			System.out.print(max);
		}
		sc.close();
	}
}