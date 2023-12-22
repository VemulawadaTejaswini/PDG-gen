import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}

		// 計算
		int result = 0;
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		for(int i = 0; i < n; i++){
		    if(tm.lowerKey(a[i]) == null){
		        if(tm.containsKey(a[i])){
		            tm.put(a[i], tm.get(a[i]) + 1);
		        }else{
		            tm.put(a[i], 1);
		        }
		    }else{
		        Integer lowerKey = tm.lowerKey(a[i]);
		        Integer lowerValue = tm.get(lowerKey);
		        if(lowerValue == 1){
		            tm.remove(lowerKey);
		        }else{
		            tm.put(lowerKey, lowerValue - 1);
		        }
		        if(tm.containsKey(a[i])){
		            tm.put(a[i], tm.get(a[i]) + 1);
		        }else{
		            tm.put(a[i], 1);
		        }
		    }
		}
		for(Integer i : tm.keySet()){
		    result += tm.get(i);
		}
		// 出力
		System.out.println(result);
		
	}
}