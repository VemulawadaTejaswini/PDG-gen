import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int A[]=new int[N];
        int B[]=new int[N];
        int C[]=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            B[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            C[i]=sc.nextInt();
        }
        int ans=0;
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        for(int i=N-1;i>=0;i--){
            for(int j=N-1;j>=0;j--){
                if(A[i]>=B[j])break ;
                lavel:for(int k=N-1;k>=0;k--){
                    if(B[j]>=C[k])break lavel;
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}