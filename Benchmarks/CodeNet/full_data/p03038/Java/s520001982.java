import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		PriorityQueue<Integer> a = new PriorityQueue<Integer>();
		for(int i = 0; i < n; i++){
		    a.add(sc.nextInt());
		}
		
		// 計算
		long result = 0;
		for(int i = 0; i < m; i++){
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    for(int j = 0; j < b; j++){
		        int now = a.poll();
		        if(now < c){
		            a.add(c);
		        }else{
		            a.add(now);
		            break;
		        }
		    }
		}
		while(a.size() > 0){
		    result += a.poll();
		}

		// 出力
		System.out.println(result);
	}
}