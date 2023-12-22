import java.util.*;

import javax.print.DocFlavor.STRING;

public class Main {
	int MOD = 1000000007;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.next();
			char [] data = s.toCharArray();
			int n = data.length;
			
			long sum = (long)n * (n - 1) / 2 + 1;
//			debug(s.substring(0, n));
			
			long count = 0;
			for(int i = 0; i < n; i++){
				for(int j = 1; j < (n+2) / 2; j++){
					int begin = i - j;
					if(begin < 0)break;
					int end = i + j;
					if(end >= n) break;
					if(data[begin] == data[end]){
						count++;
					}
//					else{
//						break;
//					}
				}
				
				if(i == n-1) continue;
				for(int j = 1;j < (n+2) / 2; j++){
					int begin = i - j + 1;
					if(begin < 0)break;
					int end = i + j;
					if(end >= n) break;
					if(data[begin] == data[end]){
						count++;
					}
//					else{
//						break;
//					}
				}
			}
			System.out.println(sum - count);
		}
	}



	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
