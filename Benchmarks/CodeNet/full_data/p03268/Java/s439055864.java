import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Set;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmpArray = br.readLine().split(" ");
		int n = Integer.parseInt(tmpArray[0]);
		int K = Integer.parseInt(tmpArray[1]);
		
		int result = 0;
//		for(int i = 1; i <= n; i++){
//			int s1 = K - i%K;
//			for(int j = s1; j <= n; j += K){
//				System.out.println("i = "+i + " j = "+j);
//				
//				int s2 = K - j%K;
//				System.out.println("s2 = "+s2);
//				
//				int x = n/K;
//				if(s2 < K){
//					x = (n + s2)/K;
//				}
//				result += x;
//				System.out.println("result = "+result);
//			}
//		}
		
		for(int i = 1; i <= n; i++){
			int m1 = K - i%K;
//			System.out.println("i = "+i);
			if((m1 *2)%K != 0){
//				System.out.println("invalid");
				continue;
			}
			else {
				//bやcの候補の数
				int tmp = (n - m1)/K + 1;
//				System.out.println("(n - m1) = "+(n - m1) +" tmp = "+tmp);
				
				result += tmp*tmp;
			}
		}
	
		
		System.out.println(result);
		
	}
	
}