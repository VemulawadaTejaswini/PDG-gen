import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];

		int[] j = new int[n];

		for (int i = 0; i < n; i++) {
			j[i] = i+1;
		}

		a[0] = scanner.nextInt();
		int max = a[0];
		int maxi = 0;
		for (int i = 1; i < n; i++) {
			a[i] = scanner.nextInt();
			if(max<a[i]){
				maxi = i;
			}
		}
		int ji = 0;
		maxi = (maxi + 1) % n;
		while(true){
			a[maxi] = a[maxi] -j[ji];
			if(a[maxi]>=0) {
				if (ji == 4) {
					max = a[0];
					maxi = 0;
					for (int i = 1; i < n; i++) {
						if (max < a[i]) {
							maxi = i;
						}
					}
					ji = 0;
					maxi = (maxi + 1) % n;
				} else {
					maxi = (maxi + 1) % n;
					ji++;
				}
			}else{
				for (int i = 0; i < n; i++) {
					if(a[i]!=0){
						if(i != maxi) {
							System.out.println("NO");
							return;
						}
					}
				}
				System.out.println("YES");
				return;
			}
		}
	}
}