import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();
		int h[] = new int[N];
		double k[] = new double[N];
		double l[] = new double[N];
		
		for (int i=0; i<N; i++){
			k[i] = T-(sc.nextInt()*0.006);
			if (A > k[i]){
				l[i] = A - k[i];
			}
			else {
				l[i] = k[i] - A;
			}
		}
		
		int kai = 0;
		double tmp = 0;
		for (int i=0; i<N; i++){
			if (i == 0){
				kai = 0;
				tmp = l[i];
			}
			else {
				if (tmp > l[i]){
					kai = i;
					tmp = l[i];
				}
			}
		}
		
		
		
		
		System.out.println(kai+1);
		
		return;
		
		
	}
	
}
