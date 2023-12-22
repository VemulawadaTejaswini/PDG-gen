import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		long k = sc.nextLong();
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}

		// 計算
		long result = 0;
		long cnt = 0;
		long cnt2 = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
		    for(int j : list){
		        if(j > a[i]){
		            cnt++;
		        }else if(j < a[i]){
		            cnt2++;
		        }
		    }
		    list.add(a[i]);
		}
		

        result = cnt*k + (cnt + cnt2)*k*(k-1)/2;
        
        long k_ = k%1000000007;
        long k_1 = (k - 1);
        long c_ = (cnt + cnt2)%1000000007;
        long t = (c_*k_)%1000000007;
        long result2 = (cnt*k_)%1000000007 + (t*k_1/2)%1000000007;

		// 出力
		//System.out.println(cnt);
		//System.out.println(cnt2);
		//System.out.println(result);
	    //System.out.println(result%1000000007);
	    //System.out.println(floorMod(result, 1000000007L));
		//System.out.println(result2);
	    System.out.println(result2%1000000007);
		//System.out.println(k_1);
		//System.out.println(t);
		//System.out.println();
	}

}
