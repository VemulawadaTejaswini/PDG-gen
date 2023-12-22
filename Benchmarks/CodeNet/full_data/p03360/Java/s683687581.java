import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();


        System.out.println(calc(A, B, C, K));
    }

    public static int calc(int A, int B, int C, int K) {

		int mid = Integer.max(A, B);
//		System.out.println("mid:" + mid);
		int low = Integer.min(A, B);
//		System.out.println("low:" + low);
		int max = Integer.max(mid, C);
		mid = Integer.min(mid, C);
//		System.out.println("max:" + max);

		int total = max;

		for (int i = 1; i <= K; i++) {
			total = total * 2;
//			System.out.println("total:" + total);
		}

		total = total + mid + low;
//		System.out.println("total:" + total);
		return total;
	}
}