import java.util.*;

public class Main {

    int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int[] L=new int[2*N];
        for(int i=0;i<2*N;i++){
            L[i]=sc.nextInt();
        }
        Arrays.sort(L);
        int ans=0;
        for(int i=0;i<2*N;i+=2){
            ans+=L[i];
        }
        System.out.println(ans);
    }
}