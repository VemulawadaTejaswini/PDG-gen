import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] count = new int[N+1]; //その数値がいくつあるか
        long sum = 0;

        //入力
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
            count[A[i]]++;
        }

        for(int i=0; i<N+1; i++) {
            sum += comb2(count[i]);
        }

        //count[A[i] + 1] は n-1C2 - nC2の差分を計算した
        for(int i=0; i<N; i++) {
            System.out.println(sum - count[A[i]] + 1);
        }

	}
	public static int comb2(int num){
        int ans = (num * (num - 1)) / 2;
		return ans;
    }
}