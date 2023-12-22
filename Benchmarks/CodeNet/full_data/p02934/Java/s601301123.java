
import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        int sumA = 0;
        int multiA = 1;

        for(int i = 0; i < N; i++){
            sumA += A[i];
        }

        for(int i = 0; i < N; i++){
            multiA *= A[i];
        }

        System.out.println((double)multiA / sumA);




    }
}



