import java.util.*;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int B[] = new int[N];

		for (int i=0;i<N;i++) {
		B[i] = sc.nextInt();
		}

		int cnt=0;
		loop: while(true){
			for (int i=0;i<N;i++) {
				if(B[i]%2==1){
					break loop;
				}
			}
			for (int i=0;i<N;i++) {
				B[i]/=2;
			}
			cnt++;
		}
		System.out.println(cnt);
	}
}