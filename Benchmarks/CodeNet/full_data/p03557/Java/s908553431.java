import java.util.*;
 
public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] A = new int[3][N];
        for(int i = 0; i < N; i++){
            A[0][i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            A[1][i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            A[2][i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(A[0]);
        Arrays.sort(A[1]);
        Arrays.sort(A[2]);
        int[][] B = new int[2][N];
        for(int i = 0; i < N; i++){
            B[0][i] = N - index(A[0], A[1], i);
            B[1][i] = N - index(A[1], A[2], i);
        }
       
        int sum = 0;
        if(A[0][0] >= A[1][N-1] || A[1][0] >= A[2][N-1]){
            System.out.println(sum);
        } else {
            for(int i = 0; i < N; i++){
                for(int j = N-B[0][i]; j < N; j++)
                    sum += B[1][j];
            }
        }
        System.out.println(sum);
    }

    static int index(int[] a, int[] b, int n){
        for(int i = 0; i < a.length; i++){
            if(a[n] < b[i])
                return i;
        }
        return a.length;
    }
}