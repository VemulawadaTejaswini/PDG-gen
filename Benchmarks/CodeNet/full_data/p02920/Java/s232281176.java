import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		Integer[] s = new Integer[1 << n];
		PriorityQueue<Integer> remain = new PriorityQueue<Integer>(Comparator.reverseOrder());
		for(int i = 0; i < 1 << n; i++){
		    s[i] = sc.nextInt();
		    remain.add(s[i]);
		}
		
		// 計算
		String result = "Yes";
		remain.poll();
		Arrays.sort(s, Comparator.reverseOrder());
		for(int i = 0; i < n; i++){
		    for(int j = 0; j < 1 << i; j++){
		        if(remain.isEmpty()){
		            result = "No";
		            continue;
		        }
		        int now = remain.poll();
		        if(now >= s[j]) result = "No";
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}
