import java.util.Scanner;

public class Main {

	private static final long x = 1000000000 + 7;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n+1];
		for(int i=2;i<n+1;i++){
			int y = i;
			while(1 < y) {
				for(int j=2;j<y+1;j++){
					if(y % j == 0){
						a[j]++;
						y /= j;
						break;
					}
				}
			}
		}

		long count = 1;
		for(int i=0;i<n+1;i++){
			if(a[i] != 0){
				count *= (a[i] + 1);
				count %= x;
			}
		}
		System.out.println(count);
	}

}
