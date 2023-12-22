import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug != false) {
            return;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        long A[];
        long B[];

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            A = new long[N+1];
            B = new long[N];
            for(int i =0;i < N+1;i++){
                A[i] = sc.nextLong();
            }
            for(int i =0;i < N;i++){
                B[i] = sc.nextLong();
            }
        }
        long result = 0;
        for(int i =0;i < N;i++){
            if(B[i] > A[i]){
                result += A[i];
                long temp = A[i];
                A[i]-=temp;
                B[i] -=temp;
            }else{
                result += B[i];
                long temp = B[i];
                B[i]-=temp;
                A[i] -=temp;
            }
            if(B[i] > A[i+1]){
                result += A[i+1];
                long temp = A[i+1];
                A[i+1]-=temp;
                B[i] -=temp;
            }else{
                result += B[i];
                long temp = B[i];
                B[i]-=temp;
                A[i+1] -=temp;
            }
        }
        System.out.println(result);




        return;
    }
}
