import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();

		long cnt=0;
		for (int i=0;i<N+1;i++) {
			for (int j=0;j<N+1;j++) {
				if ((N-R*i-G*j)>=0 && (N-R*i-G*j)%B==0) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}