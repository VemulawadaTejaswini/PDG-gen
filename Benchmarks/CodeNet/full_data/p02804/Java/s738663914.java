import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
      int[] A = new int[N];
      for (int i = 0; i < N; i++) {
         A[i] = sc.nextInt();
      }
		System.out.println(setTotal(Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0, A, K)% 1000000007);
	}
   
   public static int setTotal(int max, int min, int count, int index, int[] A, int K) {
      if (count == K) {
         return (max - min) % 1000000007;
      } else if (index < A.length) {
         //System.out.println("max:" + max + " min:" + min + " count:" + count + " index:" + index);
         return (setTotal(Math.max(A[index], max), Math.min(A[index], min), count + 1, index + 1, A, K)
            + setTotal(max, min, count, index + 1, A, K)) % 1000000007;
      } else {
         return 0;
      }
   }
}