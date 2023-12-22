import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n+1];
		h[0] = 0;
		for(int i = 1; i < n+1; i++)
			h[i] = sc.nextInt();
		
		int count = 0;
		for(int i = 1; i < h.length; i++) {
			boolean ok = true;
			for(int j = 0; j < i; j++) {
				if(h[i] < h[j]) {
					ok = false;
					break;
				}
			}
			if(ok)
				count++;
		}
		System.out.println(count);
	}
}
