
import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        int maxA[] = new int[N];
        int B[] = new int[N-1];
        int sumOfA = 0;

        for(int i = 0; i < N-1; i++){
            B[i] = sc.nextInt();
        }

        maxA[0] = B[0];
        for(int i = 1; i < N-1; i++){
            maxA[i] = Math.min(B[i-1],B[i]);
        }
        maxA[N-1] += B[N-2];

        for(int i = 0; i < N; i++){
            sumOfA += maxA[i];
        }


        System.out.println(sumOfA);

    }
}



