import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();
		int[] H = new int[N];

		for(int i=0;i<N;i++) {
			H[i] = sc.nextInt();
		}

		double diff = 100001;
		int index = -1;
		for(int i=0;i<H.length;i++) {
			double d = Math.abs(A- (T - H[i]*0.006));
			if(diff >d) {
				diff = d;
				index = i;
			}
		}
//	    int ans = ;
	    System.out.println(index+1);
	    sc.close();
	}



}
