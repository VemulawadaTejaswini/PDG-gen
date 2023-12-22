import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n];
		int[] cntD = new int[n];
		
		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
			cntD[d[i]]++;
		}
		
		boolean exist = d[0] == 0;
		for (int i = 2; i < n; i++) {
			if (d[i - 1] == 0 && d[i] != 0) {
				exist = false;
				break;
			}
		}
		
		if (!exist) {
			System.out.println(0);
			sc.close();
			return;
		}
		
		int cnt = 1;
		for (int i = 2; i < n - 1; i++) {
			cnt *= (int) Math.pow(cntD[i - 1], cntD[i]);
		}
		
		System.out.println(cnt);
		
		sc.close();
	}
}

