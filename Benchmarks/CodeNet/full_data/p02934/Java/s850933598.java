
import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        double inverseA[] = new double[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            inverseA[i] = 1 / (double)A[i];
        }

        double sumInverseA = 0;
        for(int i = 0; i < N; i++){
            sumInverseA += inverseA[i];
        }


        System.out.println(1 / sumInverseA);




    }
}



