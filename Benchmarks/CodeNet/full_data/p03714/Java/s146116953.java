import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		long sum = 0;
		PriorityQueue<Integer> first = new PriorityQueue<Integer>();
		for(int i = 0; i < n; i++){
		    int a = sc.nextInt();
		    first.add(a);
		    sum += a;
		}
		int[] mid = new int[n];
		for(int i = 0; i < n; i++){
		    mid[i] = sc.nextInt();
		}
		PriorityQueue<Integer> last = new PriorityQueue<Integer>(Comparator.reverseOrder());
		for(int i = 0; i < n; i++){
		    int a = sc.nextInt();
		    last.add(a);
		    sum -= a;
		}
		
		// 計算
		long result = 0;
		long[] largeSum = new long[n+1];
		for(int i = 0; i < n; i++){
		    int min = first.peek();
		    int plus = 0;
		    if(mid[i] > min){
		        plus = mid[i] - min;
		        first.poll();
		        first.add(mid[i]);
		    }
		    largeSum[i+1] = largeSum[i] + plus;
		}
		long[] smallSum = new long[n+1];
		for(int i = 0; i < n; i++){
		    int max = last.peek();
		    int plus = 0;
		    if(mid[n-1-i] < max){
		        plus = max - mid[n-1-i];
		        last.poll();
		        last.add(mid[n-1-i]);
		    }
		    smallSum[n-i-1] = smallSum[n-i] + plus;
		}
		long tmp = 0;
		for(int i = 0; i < n+1; i++){
		    tmp = max(tmp, largeSum[i] + smallSum[i]);
		}
		result = sum + tmp;
		
		// 出力
		System.out.println(result);
	}
}
