import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}
	
	private void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		
		int [] requests = new int [N];
		
		int [] froms = new int[M];
		int [] tos = new int[M];
		
		
		for (int i=0; i<M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			froms[i] = a;
			tos[i] = b;
			for (int j=a;j<b;j++) {
				requests[j]++;
			}
		}
//		System.out.println(Arrays.toString(requests));
		int count =0;
		boolean [] removed = new boolean[M];
		Arrays.fill(removed, false);
		while(!requestEmpty(requests)) {
			int max=0;
			int index=-1;
			for (int i=0; i< requests.length;i++) {
				if (requests[i]>max) {
					index =i;
					max = requests[i];
				}
			}
			for (int j = 0; j < M; j++) {
				if (!removed[j] && froms[j] <= index && index < tos[j]) {
					for (int k = froms[j]; k < tos[j]; k++) {
						requests[k]--;
					}
					removed[j] = true;
				}
			}
//			System.out.println(Arrays.toString(requests));
			count++;
		}
		System.out.println(count);
		
		sc.close();
	}

	public static boolean requestEmpty(int [] r) {
		for (int i=0; i< r.length; i++) {
			if (r[i] >0) {
				return false;
			}
		}
		return true;
	}
	
}


