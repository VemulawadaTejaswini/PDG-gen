public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); 
		int B = sc.nextInt(); 
		int C = sc.nextInt(); 
		long K = sc.nextLong(); 
		sc.close();
		long answer = 0L;
		if(K <= A) {
			answer = K;
		} else if(K <= (A + B)) {
			answer = A;
		} else {
			answer = A - (K - A - B); 
		}
		System.out.println(answer);
	}
}
