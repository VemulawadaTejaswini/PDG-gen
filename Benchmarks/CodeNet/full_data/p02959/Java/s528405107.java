import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N+1];
        int[] B = new int[N];

        for(int i=0; i<=N; i++){
            A[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            B[i] = sc.nextInt();
        }

        int count = 0;
        for(int i=0; i<N; i++){
            int current = A[i];
            int next = A[i+1];
            if(current <= B[i]){
                B[i] -= current;
                A[i] = 0;
            }else{
                A[i] -= B[i];
                B[i] = 0;
            }

            if(B[i] > 0){
                if(next <= B[i]){
                    B[i] -= next;
                    A[i+1] = 0;
                }else{
                    A[i+1] -= B[i];
                    B[i] = 0;
                }
            }

            count += current - A[i] + next - A[i+1];
        }

        println(count);
    }

    static void println(Object o){
        System.out.println(o);
    }
    static void print(Object o){
        System.out.print(o);
    }
}
