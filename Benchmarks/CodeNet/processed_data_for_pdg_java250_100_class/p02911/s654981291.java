public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); 
		int K = sc.nextInt(); 
		int Q = sc.nextInt(); 
		int A[] =  new int[Q]; 
		for(int i=0;i<Q;i++) {
			A[i] = sc.nextInt();
		}
		int points[] = new int[N];
		for (int point :points ) {
			point=0;
		}
		for(int i=0;i<Q;i++) {
			points[A[i]-1]++;
		}
		for (int point :points ) {
			if(point>Q-K) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}
