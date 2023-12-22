import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int[] x=new int[N];
        int[] y=new int[M];
        for(int i=0;i<N;i++){
            x[i]=sc.nextInt();
        }
        for(int i=0;i<M;i++){
            y[i]=sc.nextInt();
        }
        Arrays.sort(x);
        Arrays.sort(y);
        for(int i=x[N-1]+1;i<=y[0];i++){
            if(X<i&&i<=Y){
                System.out.println("No War");
                return ;
            }
        }
        System.out.println("War");
    }
}