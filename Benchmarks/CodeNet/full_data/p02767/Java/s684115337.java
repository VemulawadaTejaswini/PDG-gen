import java.lang.Math;
import java.util.*;
class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X[] = new int[N];
        for (int i=0; i<N; i++) {
        		X[i] = sc.nextInt();
        }
        Arrays.sort(X);
        int min = X[0];
        int P = min;
        int Sum = 1000000000;
        while (true) {
        		int sum = 0;
        		for (int i=0; i<N; i++) {
        			sum += Math.pow(X[i]-P, 2);
        		}
        		P++;
        		if (Sum < sum) break;
        		Sum = sum;
        }
        System.out.println(Sum);
    }
} 