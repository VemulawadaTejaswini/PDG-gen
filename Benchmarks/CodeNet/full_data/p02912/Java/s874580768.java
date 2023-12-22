import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        double[] list = new double[N];
        for (int i=0; i < N ; i++) {
        	list[i] = sc.nextDouble() ;
        }
        sc.close();
        for (int i = 0; i < M ; i++) {
        	Arrays.sort(list);
        	list[N-1] /= 2;
        }
        long sum = 0;
        for (int i = 0; i < N ; i++ ) {
        	sum += Math.floor(list[i]);
        }

		System.out.println(sum);


    }
}