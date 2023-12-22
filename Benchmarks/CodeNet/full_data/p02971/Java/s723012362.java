import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A[] = new int[N];
        int B[] = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
            B[i] = A[i];
        }

        Arrays.sort(B);
        
        int max = B[N - 1];
        int next_max = max;

        for(int i = N - 1; i >= 0; i--){
            if(B[i] != max){
                next_max = B[i];
                break;
            }
        }

        for(int i = 0; i < N; i++){
            if(A[i] != max){
                System.out.println(max);
            }else{
                System.out.println(next_max);
            }
        }

        sc.close();
    }
}