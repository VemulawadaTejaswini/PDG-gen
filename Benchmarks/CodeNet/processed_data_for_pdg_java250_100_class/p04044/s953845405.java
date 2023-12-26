public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int l = sc.nextInt();
		String a[]= new String[N];
		for(int i=0;i<N;i++) {
			a[i]=sc.next();
		}
		Arrays.sort(a);
		for(String b : a) {
			System.out.print(b);
		}
	}
}
