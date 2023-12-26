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
		StringBuilder sb = new StringBuilder();
		for (int point :points ) {
			if(point>Q-K) {
				sb.append("Yes");
				sb.append(System.getProperty("line.separator"));
			}else {
				sb.append("No");
				sb.append(System.getProperty("line.separator"));
			}
		}
		String ans = sb.toString();
		System.out.println(ans);
	}
}
