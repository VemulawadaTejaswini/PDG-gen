import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        int ans=0;
        Arrays.sort(A);
        if(N%2==0){
            for(int i=N-1;i>=(N/2)+1;i--){
                ans+=2*A[i];
            }
            for(int i=0;i<(N/2)-1;i++){
                ans-=2*A[i];
            }
            ans+=A[N/2];
            ans-=A[N/2-1];
        }else{
            for(int i=N-1;i>=(N/2)+1;i--){
                ans+=2*A[i];
            }
            for(int i=0;i<=(N/2)-2;i++){
                ans-=2*A[i];
            }
            ans-=A[N/2];
            ans-=A[N/2-1];
            int ans2=0;
            for(int i=N-1;i>=(N/2)+2;i--){
                ans2+=2*A[i];
            }
            for(int i=0;i<=(N/2)-1;i++){
                ans2-=2*A[i];
            }
            ans2+=A[N/2+1];
            ans2+=A[N/2];
            ans=Math.max(ans,ans2);
        }
        System.out.println(ans);
    }
}
