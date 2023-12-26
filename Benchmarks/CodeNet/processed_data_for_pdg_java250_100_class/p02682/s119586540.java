public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		int total = 0;  
		if(A >= K) {  
			System.out.println(total=K);
			return;
		}
		else {  
			total = A;
		}
		if(B < K-A) {  
			System.out.println(total-= K-A-B);
		}
		else {  
			System.out.println(total);
		}
	}
}
