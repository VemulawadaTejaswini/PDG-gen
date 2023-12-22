import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		int[] l = new int[n];
		int[] r = new int[n];
		for(int i=0; i<n; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
		
			if(l[i]<=r[i]) {
				int count = 0;
				for(int j=l[i]; j<=r[i]; j++) {
					if(isPrim(j)) {
						int tmp = (j+1)/2;
						if(isPrim(tmp)) {
							count ++;
						}
					}
				}
				System.out.println(count);
			}
			
		}
		
	
	}

	private static boolean isPrim(int j) {
		if(j<2) {
			return false;
		}
		if(j%2==0 && j>2) {
			return false;
		}
		for(int i=2; i<=Math.sqrt(j);i++) {
			if(j%i==0) {
				return false;
			}
		}
		return true;
	}
}
