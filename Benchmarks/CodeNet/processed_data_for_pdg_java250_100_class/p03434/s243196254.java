public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		int[] a = new int[t];
		int j = 0;
		while (t-- > 0) {
			a[j] = sc.nextInt();
			j++;
		}
		sc.close();
		Arrays.sort(a);
		int len = a.length;
		int A = 0; 
		int B = 0; 
		for (int i = 0; i<len; i+=2) {
			A+=a[i];
		}
		for (int i = 1; i<len; i+=2) {
			B+=a[i];
		}
		int result = Math.abs(A-B);
		System.out.println(result);
	}
}
