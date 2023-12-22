
import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        int P[] = new int[N];


        for(int i = 0; i  < N; i++){
          A[i] = sc.nextInt();
        }

        for(int i = 0; i  < N; i++){
            P[A[i] - 1] = i + 1;
        }

        for(int i = 0; i < N; i++){
          System.out.print(P[i] + " ");
        }

    }
}





