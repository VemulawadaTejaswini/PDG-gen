import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();
		int[][] train = new int[m][2];
		for(int i = 0; i < m; i++){
		    train[i][0] = sc.nextInt();
		    train[i][1] = sc.nextInt();
		}
		Arrays.sort(train, (s, t) -> Integer.compare(s[0], t[0]));
		int[][] query = new int[q][2];
		for(int i = 0; i < q; i++){
		    query[i][0] = sc.nextInt();
		    query[i][1] = sc.nextInt();
		}
		
		
		// 計算
		Integer[] from = new Integer[m];
		Integer[] to = new Integer[m];
		for(int i = 0; i < m; i++){
		    from[i] = train[i][0];
		    to[i] = train[i][1];
		}
		for(int i = 0; i < q; i++){
		    int result = 0;
		    int indexFrom = lowerBound(from, query[i][0]);
		    //System.out.println("indexFrom:" + indexFrom);
		    //System.out.println("to:" + Arrays.toString(to));
		    if(indexFrom < m){
		        Integer[] to2 = Arrays.copyOfRange(to, indexFrom, m);
		        Arrays.sort(to2);
		        //System.out.println("to2:" + Arrays.toString(to2));
		        int indexTo = upperBound(to2, query[i][1]) - 1;
		        result += indexTo + 1;
		    }
		    System.out.println(result);
		}
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
