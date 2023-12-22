import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();

        Long[] A = new Long[N+1];
        Long[] B = new Long[N];

        for(int i=0; i<=N; i++){
            A[i] = sc.nextLong();
        }

        for(int i=0; i<N; i++){
            B[i] = sc.nextLong();
        }

        Long count = 0L;
        for(int i=0; i<N; i++){
            Long current = A[i];
            Long next = A[i+1];
            if(current <= B[i]){
                B[i] -= current;
                A[i] = 0L;
            }else{
                A[i] -= B[i];
                B[i] = 0L;
            }

            if(B[i] > 0){
                if(next <= B[i]){
                    B[i] -= next;
                    A[i+1] = 0L;
                }else{
                    A[i+1] -= B[i];
                    B[i] = 0L;
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
