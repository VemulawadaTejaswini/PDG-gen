import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] l = new int[n];
		for (int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}
		
		int cnt=0;
		for (int a = 0; a < n-2; a++) {
			for (int b = a+1; b < n-1; b++) {
				for (int c = b+1; c < n; c++) {
					boolean ba = l[a] < l[b]  + l[c];
					boolean bb = l[b] < l[c]  + l[a];
					boolean bc = l[c] < l[a]  + l[b];
					if( ba && bb && bc ) {
						cnt++;
					}
				}
			}
		}
		
		System.out.println(cnt);
		
	}

}
