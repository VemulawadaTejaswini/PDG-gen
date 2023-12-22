import java.util.Scanner;

public class Main{
    
 
    public static void main(String[] args)  {
        new Main().solve();
    }

    void solve(){
        Scanner sc = new Scanner(System.in);
        int N;
        N = Integer.parseInt(sc.next());
        int[] A = new int[N];
        int[] B = new int[N];
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(sc.next());
            B[A[i]-1] += 1;
        }
        sc.close();

        int ans = 0;
        for (int i=0; i < N; i++){
            ans += (B[i]*(B[i]-1))/2;
        }

        int x = 0;
        for (int i=0; i < N; i++){
            x = ans - (B[A[i]-1]-1);
            System.out.println(x);
        }
    }
}