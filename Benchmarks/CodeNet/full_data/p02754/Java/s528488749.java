import java.util.Scanner;

public class Main {
  
	public static void main(String[] args) {
      
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();
      
		//青いボールの合計個数
		int sumA = N / (A + B) * A;
		int remain = N % (A + B);

		if (remain < A) {
			sumA += remain;
		} else {
			sumA += A;
		}
		System.out.println(sumA);
      
	}
  
}