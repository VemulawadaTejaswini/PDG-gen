import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int[] a = new int[q];
		for(int i = 0; i < q; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		String[] ret = new Main().attack_survival(n, k, a);
		for(String r : ret) {
			System.out.println(r);
		}
	}
	
	public String[] attack_survival(int n, int k, int[] a) {
		int i;
		int[] player = new int[n];
		String[] result = new String[n];
		for(i = 0; i < n; i++) {
			player[i] = k + (-a.length);
		}
		
		for(int p : a) {
			player[p - 1] += 1;
		}
		for(i = 0; i < n; i++) {
			if(player[i] > 0) {
				result[i] = "Yes";
			}else {
				result[i] = "No";
			}
		}
		
		return result;
	}
}
