public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N+1];
		for(int i = 0;i < N;i++) {
			a[i] = sc.nextInt();
		}
		int max;
		for(int i = 0;i < N;i++) {
			for(int j = i;j < N;j++) {
				if(a[i]<a[j]) {
					max = a[i];
					a[i] = a[j];
					a[j] = max;			
				}
			}
		}
		int A = 0;
		int B = 0;
		for(int i = 0;i < N;i++) {
			if(i % 2 == 0) {
				A = A + a[i];
			}
			if(i % 2 != 0) {
				B = B + a[i];
			}
		}
		int point = Math.abs(A - B);
		System.out.println(point);
		sc.close();
	}
}
