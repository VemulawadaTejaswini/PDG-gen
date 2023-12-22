import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long K = sc.nextLong();

        long[] A = new long[N];

        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextLong();
        }

        if (K == 0) {
            System.out.println(A[0]);
            System.exit(0);
        }
        
        long s = 0,max=0;
        for (long i = 0; i <= K; i++) {
            for (int j = 0; j < N; j++) {
                s += i ^ A[j];
            }
            if(max<s){
                max=s;
            }
            s = 0;
        }
        System.out.println(max);
    }

}