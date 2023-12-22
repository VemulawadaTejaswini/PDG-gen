import java.util.*;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        for(int i=0; i<N; i++){
            B[i] = sc.nextInt();
        }
        for(int i=0; i<N; i++){
            C[i] = sc.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(C);
        long ans = 0;

        for(int i=0; i<N; i++){
            int a = sercha(0, N - 1, B[i], A);
            int c = serchc(0, N - 1, B[i], C);
            if(B[i]>A[a]){
                a++;
            }
            if(B[i]>=C[c]){
                c++;
            }
            System.out.println(a +" "+c);
            ans += a * (N - c);
        }
        System.out.println(ans);
    }
    private static int sercha(int lower, int upper, int x, int[] A){
        int mid = (lower + upper) / 2;
        if(lower>=upper){
            return mid;
        }
        if(A[mid]==x){
            return mid;
        }
        else if(A[mid]<x){
            lower = mid + 1;
        }
        else{
            upper = mid - 1;
        }
        mid = sercha(lower, upper, x, A);

        return mid;
    }
    private static int serchc(int lower, int upper, int x, int[] C){
        int mid = (lower + upper) / 2;
        if(lower>=upper){
            return mid;
        }
        if(C[mid]==x){
            return mid;
        }
        else if(C[mid]<x){
            lower = mid + 1;
        }
        else{
            upper = mid - 1;
        }
        mid = serchc(lower, upper, x, C);

        return mid;
    }
}