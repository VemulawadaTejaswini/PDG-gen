public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		int A[] = new int[200200];
		int B[] = new int[200200];
		for(int i = 2;i<N+1;i++) A[i] = cin.nextInt();
		for(int i = 2;i<N+1;i++) B[A[i]]++;
		for(int i = 1;i<N+1;i++) System.out.println(B[i]);
	}
}
