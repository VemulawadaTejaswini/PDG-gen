public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int[] m = new int[n];
		int minM = 1000; 
		int zensyu=0;
		for(int i=0;i<n;i++) {
			m[i]=scan.nextInt();
			zensyu = zensyu + m[i];
			minM = Math.min(m[i], minM);
		}
		System.out.println((x-zensyu)/minM + n);
	}
}
