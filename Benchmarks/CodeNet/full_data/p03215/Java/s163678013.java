

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	static int[] nk = new int[2];
	static int[] a; 
	static List<Long> sel = new ArrayList<>();
	
	public static void main(String[] args) throws Exception{
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			nk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			a = new int[nk[0]];
			a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
		}
		
		
		for (int i=0; i<nk[0]; i++) {
			long tmp = 0;
			for (int j=i; j<nk[0]; j++) {
				tmp += a[j];
				sel.add(tmp);
			}
		}
		
		Optional<Long> ma = sel.stream().max(Comparator.naturalOrder());
		long max = ma.get();
		long rst = 0;
		
		for(long i=max; i>=0; i--) {
			int cnt = 0;
			for (Long l : sel) {
				if((l & i) == i) cnt++;;
			}
			if(cnt >= nk[1]) break;
			rst = i;
		}
		
		System.out.println(rst);
	}

}
