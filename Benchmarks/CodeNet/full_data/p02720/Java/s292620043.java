import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int k = sc.nextInt();
		
		// 計算
		long result = 0;
		ArrayDeque<Long> q = new ArrayDeque<Long>();
		q.add(1L);
		q.add(2L);
		q.add(3L);
		q.add(4L);
		q.add(5L);
		q.add(6L);
		q.add(7L);
		q.add(8L);
		q.add(9L);
		for(int i = 0; i < k; i++){
		    result = q.poll();
		    if(result%10 != 0) q.add(result*10 + result%10 - 1);
		    q.add(result*10 + result%10);
		    if(result%10 != 9) q.add(result*10 + result%10 + 1);
		}
		
		// 出力
		System.out.println(result);
	}
}

