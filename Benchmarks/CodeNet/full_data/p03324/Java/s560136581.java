import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
      
     Scanner sc = new Scanner(System.in);
		int D = sc.nextInt(); 
		int N = sc.nextInt();

        if (N == 100) {
			N = 101;
		}
      
		if (D == 0) {
			System.out.println(N);
		} else if (D == 1) {
			System.out.println(100 * N);
		} else if (D == 2) {
			System.out.println(10000 * N);
		}
	}
}
