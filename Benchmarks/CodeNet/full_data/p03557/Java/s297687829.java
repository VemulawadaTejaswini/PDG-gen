import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		Integer[] a = new Integer[n];
		Integer[] b = new Integer[n];
		Integer[] c = new Integer[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
		    b[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
		    c[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		
		// 計算
		long result = 0;
		for(int i = 0; i < n; i++){
		    int indexA = lowerBound(a, b[i])-1;
		    int indexC = upperBound(c, b[i]);
		    result += (indexA+1)*(n-indexC);
		}
		
		// 出力
		System.out.println(result);
	}
	
	static int upperBound(Integer[] array, int n){
		int index = ~Arrays.binarySearch(array, n, (x,y) -> x.compareTo(y) > 0 ? 1 : -1);
		return index;
	}
	static int lowerBound(Integer[] array, int n){
		int index = ~Arrays.binarySearch(array, n, (x,y) -> x.compareTo(y) >= 0 ? 1 : -1);
		return index;
	}
}

