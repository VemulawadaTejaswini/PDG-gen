import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];
        for (int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            B[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            C[i]=sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(C);
        long ans = 0;
        for (int i=0;i<n;i++){
            int min=0;
            int max=n;
            int a;
            int c;
            while (min<max){
                int middle = (min+max)/2;
                if (A[middle]>=B[i]){
                    max = middle;
                }else if (A[middle]<B[i]){
                    min = middle+1;
                }
            }
            a = min;
            min = 0;
            max = n;
            while (min<max){
                int middle = (min+max)/2;
                if (C[middle]>=B[i]+1){
                    max = middle;
                }else if (C[middle]<B[i]+1){
                    min = middle+1;
                }
            }
            c = n-min;
            ans+=a*c;
        }
        System.out.println(ans);

    }

}
