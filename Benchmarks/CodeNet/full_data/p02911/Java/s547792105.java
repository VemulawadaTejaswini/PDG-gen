import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();

		int point[] = new int[N];
		if(K>Q) {
			for(int i=0;i<point.length;i++) {
				System.out.println("Yes");
			}
		}else {
			for(int i=0;i<Q;i++) {
				int A_i = sc.nextInt();
				point[A_i-1]=point[A_i-1]+1;
			}
	
			for(int i=0;i<point.length;i++) {
				int p = point[i]+K-Q;
				if(p>0) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
			}
		}
			
	}

}
