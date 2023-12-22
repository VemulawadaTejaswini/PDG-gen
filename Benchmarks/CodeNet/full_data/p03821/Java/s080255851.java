import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	long[] A = new long[N];
      	long[] B = new long[N];
      	for(int i = 0; i < N; i++){
          	A[i] = sc.nextInt();
          	B[i] = sc.nextInt();
        }
      	long ans = 0;
      	for(int i = N-1; i >= 0; i--){
        	if ((A[i] + ans) % B[i] == 0){
            }else{
              ans += B[i] - ((A[i] + ans) % B[i]);
            }
        }
     	System.out.println(ans);
	}
}
