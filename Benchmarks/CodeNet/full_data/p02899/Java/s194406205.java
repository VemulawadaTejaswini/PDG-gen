import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(sc.next());
		}
		int[] B = new int[N+1];
		for(int i=1;i<=N;i++) {
			for(int j=0;j<N;j++) {
				if(A[j]==i) {
					B[i] = j+1;
				}
			}
		}
		for(int i=1;i<=N;i++) {
			if(i<N) {
				System.out.print(B[i]+" ");
			} else {
				System.out.println(B[i]);
			}
		}
	}
}