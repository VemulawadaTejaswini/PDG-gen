public class Main{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt(); 
		int k = stdIn.nextInt(); 
		int q = stdIn.nextInt(); 
		int[] a = new int[n]; 
		for(int i = 0; i < n; i++) {
			a[i] = k-q;
		}
		for(int i = 0; i < q; i++) {
			int seikaisya = stdIn.nextInt()-1;
			a[seikaisya]++;
		}
		for(int i = 0; i < n; i++) {
			if(a[i]<=0) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}
	}
}
