import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}
		
		// 計算
		int result = 0;
		int min = 0;
		int max = 0;
		HashSet<Integer> hs = new HashSet<Integer>();
		int cnt = 0;
		for(int i = 0; i < n; i++){
		    if(a[i] < 400){
		        hs.add(1);
		    }else if(a[i] < 800){
		        hs.add(2);
		    }else if(a[i] < 1200){
		        hs.add(3);
		    }else if(a[i] < 1600){
		        hs.add(4);
		    }else if(a[i] < 2000){
		        hs.add(5);
		    }else if(a[i] < 2400){
		        hs.add(6);
		    }else if(a[i] < 2800){
		        hs.add(7);
		    }else if(a[i] < 3200){
		        hs.add(8);
		    }else{
		        cnt++;
		    }
		}
		if(hs.size() == 0){
		    min = 1;
		    max = cnt;
		}else{
		    min = hs.size();
		    max = min + cnt; 
		}
		

		// 出力
		System.out.println(min + " " + max);
		//System.out.println(result);
	}
}

