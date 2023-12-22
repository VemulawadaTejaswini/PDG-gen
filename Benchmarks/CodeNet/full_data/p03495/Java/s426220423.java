import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] array = new int[200001];
		Arrays.fill(array, Integer.MAX_VALUE);
		int cnt = 0;
		for(int i = 0; i < n; i++){
		    int a = sc.nextInt();
		    if(array[a] == Integer.MAX_VALUE){
		        array[a] = 1;
		        cnt++;
		    }else{
		        array[a]++;
		    }
		}
		Arrays.sort(array);
		
		// 計算
		int result = 0;
		for(int i = 0; i < cnt - k; i++){
		    result += array[i];
		}
		
		// 出力
		System.out.println(result);
	}
}

