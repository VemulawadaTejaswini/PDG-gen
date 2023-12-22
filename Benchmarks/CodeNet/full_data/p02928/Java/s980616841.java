import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        final long K = scan.nextLong();
        final int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = scan.nextInt();
        }
        scan.close();
        long result = 0L;
        for(int i = 0; i < N - 1; i++){
            for(int j = i + 1; j < N ; j++){
                if(A[i] > A[j]){
                    result+=K;
                }
            }
        }
        System.out.println(result);
        for(int i = N - 1; i >= 0; i--){
            for(int j = 0; i > j ; j++){
                if(A[i] > A[j]){
                    result = result + (K - 1);
                }
            }  
        }
        System.out.println(result % 10000000007L);
    }
}