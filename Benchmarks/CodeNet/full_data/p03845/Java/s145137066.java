import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int total = 0;
        
        int[] T = new int[N];
        
        for(int i=0;i<N;i++) {
			T[i] = sc.nextInt();
			total += T[i];
		}
		int m = sc.nextInt();
        
        for(int i=0;i<m;i++) {
			int P = sc.nextInt();
			int X = sc.nextInt();
			System.out.println(total-(T[P-1]-X));
		}
	}
}