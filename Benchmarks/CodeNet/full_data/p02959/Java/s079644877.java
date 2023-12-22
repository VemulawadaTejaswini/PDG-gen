import java.util.*;

public class Main{
    public static void main(String[] args){
    //入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Long[] A = new Long[N+1];
        Long[] B = new Long[N];
        for(int i=0; i<N+1; i++){
            A[i] = sc.nextLong();
        }
        for(int i=0;i<N;i++){
            B[i] = sc.nextLong();
        }
    //処理
    Long ans = 0L;
        for(int i=0;i<N;i++){
            if(A[i]-B[i]>=0){A[i] -= B[i];ans+=B[i];}
            else{
                ans += A[i];
                B[i] -= A[i];
                A[i] = 0L;
                
                
                if(A[i+1]-B[i]>=0L){
                    A[i+1]-=B[i];
                    ans += B[i];
                }
                else if(A[i+1]-B[i]<0L){
                    ans += A[i+1];
                    A[i+1]=0L;
                }
            }
        }
        System.out.println(ans);
        sc.close();

    }
}
