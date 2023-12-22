import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int h = sc.nextInt();
		Integer[] a = new Integer[n];
		Integer[] b = new Integer[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		    b[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		
		// 計算
		int result = 0;
		int maxA = a[n-1];
		Integer[] sumB = new Integer[n+1];
		sumB[0] = 0;
		for(int i = 0; i < n; i++){
		    sumB[i+1] = sumB[i] + b[i]; 
		}
		int index = upperBound(b, maxA);
		int x = sumB[n] - sumB[index];
		if(x < h){
		    result = n - index + (h-x+maxA-1)/maxA;
		}else{
		    int index2 = upperBound(sumB, sumB[n] - h);
		    result = n - index2 + 1;
		}
		
		// 出力
		System.out.println(result);
	}
	
	static int upperBound(Integer[] array, int n){
		int index = ~Arrays.binarySearch(array, n, (x,y) -> x.compareTo(y) > 0 ? 1 : -1);
		return index;
	}
}


