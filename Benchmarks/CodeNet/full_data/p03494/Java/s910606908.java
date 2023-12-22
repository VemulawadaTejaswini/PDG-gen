import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int ans = 0;

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        loop:for(int i=0; i<=30; i++){
            for(int j=0; j<N; j++){
                if(A[j]%2!=0){
                    System.out.println(ans);
                    break loop;
                }
                else if(A[j]%2==0){
                    A[j] = A[j] / 2;
                }
                if(j==N-1){
                    ans += 1;
                }
            }
        }
    } 
}