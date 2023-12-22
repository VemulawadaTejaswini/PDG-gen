import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int A[] = new int[N];
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        int B[] = new int[M];
        int C[] = new int[M];
        for(int i=0; i<M; i++){
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
        }

        for(int i=0; i<M; i++){
        Arrays.sort(A);
            int count = B[i];
            for(int j=0;j<A.length;j++){
                    if(A[j] < C[i]) {
                        A[j] = C[i];
                        count--;
                }
                if(count <=0) break;
            }
        }
        
        long sum = 0;
        for(int i=0; i<N; i++) sum += (long)A[i];
        System.out.println(sum);
    }
}

