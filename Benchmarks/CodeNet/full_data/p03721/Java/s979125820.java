import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] ss0 = br.readLine().trim().split(" ", 0);
		int N = Integer.parseInt(ss0[0]);
		int K = Integer.parseInt(ss0[1]);
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(-1);
		
		//long[] a = new long[N];
		//long[] b = new long[N];
		int a;
		int b;
		int[] ans = new int[N+1];
		for(int i=0; i<N; i++){
			ss0 = br.readLine().trim().split(" ", 0);
			a = Integer.parseInt(ss0[0]);
			b = Integer.parseInt(ss0[1]);
			
			for(int j=0; j<b; j++) { l.add( a ); }
		}
		
		

		//リストのソート
		Collections.sort(l); // 未指定ならば昇順

        System.out.println(l.get(K));
        return;
    }


}