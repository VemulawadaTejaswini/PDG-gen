import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] A = new long[n];
        long[] B = new long[n];
        long[] C = new long[n];
        for (int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            B[i]=sc.nextLong();
        }
        for (int i=0;i<n;i++){
            C[i]=sc.nextLong();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        long ans = 0;
        for (int i=0;i<n;i++){
            int min=-1;
            int max=n;
            long a;
            long c;
            while (min+1<max){
                int middle = (min+max)/2;
                if (A[middle]<B[i]){
                    min = middle;
                }else if (A[middle]>=B[i]){
                    max = middle;
                }
            }
            a = min+1;
            min = -1;
            max = n;
            while (min+1<max){
                int middle = (min+max)/2;
                if (C[middle]<=B[i]){
                    min = middle;
                }else if (C[middle]>B[i]){
                    max = middle;
                }
            }
            c = n-min-1;
            ans+=a*c;
        }
        System.out.println(ans);

    }

}
