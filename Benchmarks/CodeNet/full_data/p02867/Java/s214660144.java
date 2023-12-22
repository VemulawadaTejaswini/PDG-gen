import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[][] a = new int[n][2];
		int[] b = new int[n];
		for(int i = 0; i < n; i++){
		    a[i][0] = i;
		    a[i][1] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
		    b[i] = sc.nextInt();
		}
		Arrays.sort(a, (s, t) -> Integer.compare(s[1], t[1]));
		Arrays.sort(b);
		
		// 計算
		String result = "";
		int[] chk = new int[n];
		Arrays.fill(chk, -1);
		for(int i = 0; i < n; i++){
		    if(a[i][1] > b[i]){
		        result = "No";
		        System.out.println(result);
		        return;
		    }
		    if(i < n-1 && a[i+1][1] <= b[i]) result = "Yes";
		    if(a[i][0] == i) result = "Yes";
		    if(chk[i] == a[i][0]) result = "Yes";
		    chk[a[i][0]] = i;
		}
		
		// 出力
		System.out.println(result);
	}
}
