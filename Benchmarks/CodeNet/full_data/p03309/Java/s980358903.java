import java.util.*;
class Abc102c
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long[] A = new long[N];

        for(int i = 0; i < N; i++){
             A[i] = sc.nextInt() - i - 1;
        }
        Arrays.sort(A);

        long ans = 1000000000;
        long tmp1 = 0;
        for(int i = 0; i < N; i++){
            tmp1 += A[i]- A[0];
        }
        long tmp2 = 0;
        if(A[0] == A[N-1]){
            ans = 0;
        }
     /*   for(long i = A[0] + 1; i <= A[N-1]; i++){
            int ind = Arrays.binarySearch(A, i);
            if(ind < 0){
                ind = ind * (-1) - 1;
                tmp2 = tmp1 + ind + 1 - (N - ind - 1);
            }else{
                tmp2 = tmp1 + ind  + 1- (N - ind - 1);
            }
            System.out.println(tmp2);
                ans = Math.min(ans, tmp2);
                tmp1 = tmp2; 
        }*/

        for(int i = 1; i < N-1; i++){
            tmp2 = tmp1 + i * (A[i] - A[i-1]) - (N - i)  * (A[i] - A[i-1]);

            ans = Math.min(ans, tmp2);
            tmp1 = tmp2;
        }


        System.out.println(Math.abs(ans));
    }

    
}