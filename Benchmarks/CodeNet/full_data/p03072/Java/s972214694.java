import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]  h= new int[n];
		int count = 1; boolean flag = true;

		for(int i = 0; i < n; i++)
			h[i] = Integer.parseInt(sc.next());

		for(int i = 1; i < n; i++) {
			flag = true;
			for(int j = 0; j < i; j++) {
				if(h[j] > h[i]) flag = false;
			}
			if(flag) count++;
		}
		System.out.println(count);
		sc.close();
	}
}