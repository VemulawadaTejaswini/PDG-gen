import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	int[] B = new int[N-1];
      	for (int i = 0; i < N-1; i++) {
        	B[i] = sc.nextInt(); 
        }
		int total = B[0];
      	for (int i = 0; i < N-2; i++) {
          total += Math.min(B[i], B[i+1]);
        }
      	total += B[N-2];
      	System.out.println(total);
	}
}